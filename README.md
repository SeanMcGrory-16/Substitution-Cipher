# Substitution Cipher Program

## Objective
This project implements a **substitution cipher** for encrypting and decrypting messages. It also includes cryptanalysis functionality that performs **letter frequency analysis** to help break encrypted messages without knowing the key.

## Skills Learned
- Understanding of **classical cryptography** and substitution ciphers  
- Implementing **encryption, decryption, and key generation algorithms**  
- Performing **letter frequency analysis** for cryptanalysis  
- Working with **Java Collections Framework (HashMaps, Lists)**  
- Reading and processing text data from external files  

## Tools Used
- **Java** (for coding the encryption and decryption logic)  
- **Eclipse IDE** (for development and debugging)  
- **File I/O Handling** (to import and analyze corpus text)  

## Implementation Details
The program consists of multiple components:

1. **Key Generator** (&#8203;:contentReference[oaicite:0]{index=0}): Creates a randomized mapping of letters for encryption.  
2. **Encryptor** (&#8203;:contentReference[oaicite:1]{index=1}): Uses the key to substitute plaintext characters with ciphertext characters.  
3. **Decryptor** (&#8203;:contentReference[oaicite:2]{index=2}): Reverses the encryption process using the key.  
4. **Letter Frequency Analyzer** (&#8203;:contentReference[oaicite:3]{index=3}): Calculates letter frequency in plaintext and ciphertext to analyze encryption effectiveness.  
5. **Corpus Importer** (&#8203;:contentReference[oaicite:4]{index=4}): Reads input text from a file for testing encryption and cryptanalysis.  
6. **Cipher Main Class** (&#8203;:contentReference[oaicite:5]{index=5}): Runs the entire process, including encryption, decryption, and frequency analysis.  

## Steps
1. **Generate a substitution cipher key** using **Key_Generator.java**  
2. **Encrypt a message** using **Encryptor.java**  
3. **Analyze the letter frequency** in both plaintext and encrypted text  
4. **Attempt decryption** using **Decryptor.java**  
5. **Compare plaintext vs. ciphertext letter distributions** to assess security  

---

## Next Steps
- Improve cryptanalysis by implementing **bigram and trigram frequency analysis**  
- Expand the cipher to support **special characters and numbers**  
- Optimize file handling for **larger datasets**  

📌 **Screenshots & Demonstrations:** Add screenshots of your program output using `imgsrc` or drag & drop them into the GitHub project page.  
