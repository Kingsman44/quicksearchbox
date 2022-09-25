package android.support.p028c;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: android.support.c.d */
/* compiled from: PG */
final class C0128d implements Closeable {

    /* renamed from: a */
    private final File f327a;

    /* renamed from: b */
    private final long f328b;

    /* renamed from: c */
    private final File f329c;

    /* renamed from: d */
    private final RandomAccessFile f330d;

    /* renamed from: e */
    private final FileChannel f331e;

    /* renamed from: f */
    private final FileLock f332f;

    public C0128d(File file, File file2) {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f327a = file;
        this.f329c = file2;
        this.f328b = m133c(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f330d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f331e = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f332f = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                m136f(this.f331e);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                m136f(this.f331e);
                throw e;
            } catch (Error e3) {
                e = e3;
                m136f(this.f331e);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            m136f(this.f330d);
            throw e4;
        }
    }

    /* renamed from: b */
    private static long m132b(File file) {
        long lastModified = file.lastModified();
        if (lastModified == -1) {
            return -2;
        }
        return lastModified;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private static long m133c(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, C33259r.f88929b);
        try {
            long length = randomAccessFile.length() - 22;
            if (length >= 0) {
                long j = -65536 + length;
                if (j < 0) {
                    j = 0;
                }
                int reverseBytes = Integer.reverseBytes(101010256);
                do {
                    randomAccessFile.seek(length);
                    if (randomAccessFile.readInt() == reverseBytes) {
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        long reverseBytes2 = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                        CRC32 crc32 = new CRC32();
                        randomAccessFile.seek(4294967295L & ((long) Integer.reverseBytes(randomAccessFile.readInt())));
                        byte[] bArr = new byte[16384];
                        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, reverseBytes2));
                        while (true) {
                            if (read == -1) {
                                break;
                            }
                            crc32.update(bArr, 0, read);
                            reverseBytes2 -= (long) read;
                            if (reverseBytes2 == 0) {
                                break;
                            }
                            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, reverseBytes2));
                        }
                        long value = crc32.getValue();
                        randomAccessFile.close();
                        if (value == -1) {
                            return -2;
                        }
                        return value;
                    }
                    length--;
                } while (length >= j);
                throw new ZipException("End Of Central Directory signature not found");
            }
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    /* renamed from: d */
    private static SharedPreferences m134d(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.zip.ZipFile} */
    /* JADX WARNING: type inference failed for: r1v37 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m135e() {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r2 = ".zip"
            java.lang.String r3 = ".dex"
            java.lang.String r4 = "Failed to close resource"
            java.lang.String r5 = "classes"
            java.io.File r0 = r1.f327a
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r6 = ".classes"
            java.lang.String r6 = r0.concat(r6)
            java.io.File r0 = r1.f329c
            android.support.c.b r7 = new android.support.c.b
            r7.<init>()
            java.io.File[] r0 = r0.listFiles(r7)
            java.lang.String r8 = "MultiDex"
            if (r0 != 0) goto L_0x0046
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed to list secondary dex dir content ("
            r0.<init>(r9)
            java.io.File r9 = r1.f329c
            java.lang.String r9 = r9.getPath()
            r0.append(r9)
            java.lang.String r9 = ")."
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r8, r0)
            goto L_0x0099
        L_0x0046:
            int r9 = r0.length
            r10 = 0
        L_0x0048:
            if (r10 >= r9) goto L_0x0099
            r11 = r0[r10]
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Trying to delete old file "
            r12.<init>(r13)
            java.lang.String r13 = r11.getPath()
            r12.append(r13)
            java.lang.String r13 = " of size "
            r12.append(r13)
            long r13 = r11.length()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.i(r8, r12)
            boolean r12 = r11.delete()
            if (r12 != 0) goto L_0x0085
            java.lang.String r11 = r11.getPath()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r12 = "Failed to delete old file "
            java.lang.String r11 = r12.concat(r11)
            android.util.Log.w(r8, r11)
            goto L_0x0096
        L_0x0085:
            java.lang.String r11 = r11.getPath()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r12 = "Deleted old file "
            java.lang.String r11 = r12.concat(r11)
            android.util.Log.i(r8, r11)
        L_0x0096:
            int r10 = r10 + 1
            goto L_0x0048
        L_0x0099:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.zip.ZipFile r10 = new java.util.zip.ZipFile
            java.io.File r0 = r1.f327a
            r10.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0301 }
            r0.<init>()     // Catch:{ all -> 0x0301 }
            r0.append(r5)     // Catch:{ all -> 0x0301 }
            r11 = 2
            r0.append(r11)     // Catch:{ all -> 0x0301 }
            r0.append(r3)     // Catch:{ all -> 0x0301 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0301 }
            java.util.zip.ZipEntry r0 = r10.getEntry(r0)     // Catch:{ all -> 0x0301 }
            r11 = r0
            r12 = 2
        L_0x00be:
            if (r11 == 0) goto L_0x02f5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0301 }
            r0.<init>()     // Catch:{ all -> 0x0301 }
            r0.append(r6)     // Catch:{ all -> 0x0301 }
            r0.append(r12)     // Catch:{ all -> 0x0301 }
            r0.append(r2)     // Catch:{ all -> 0x0301 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0301 }
            android.support.c.c r13 = new android.support.c.c     // Catch:{ all -> 0x0301 }
            java.io.File r14 = r1.f329c     // Catch:{ all -> 0x0301 }
            r13.<init>(r14, r0)     // Catch:{ all -> 0x0301 }
            r9.add(r13)     // Catch:{ all -> 0x0301 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0301 }
            r0.<init>()     // Catch:{ all -> 0x0301 }
            java.lang.String r14 = "Extraction is needed for file "
            r0.append(r14)     // Catch:{ all -> 0x0301 }
            r0.append(r13)     // Catch:{ all -> 0x0301 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0301 }
            android.util.Log.i(r8, r0)     // Catch:{ all -> 0x0301 }
            r0 = 0
            r14 = 0
        L_0x00f2:
            r15 = 3
            if (r0 >= r15) goto L_0x029c
            if (r14 != 0) goto L_0x0296
            int r14 = r0 + 1
            java.io.InputStream r15 = r10.getInputStream(r11)     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = "tmp-"
            java.lang.String r0 = r0.concat(r6)     // Catch:{ all -> 0x0291 }
            java.io.File r7 = r13.getParentFile()     // Catch:{ all -> 0x0291 }
            java.io.File r7 = java.io.File.createTempFile(r0, r2, r7)     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = "Extracting "
            java.lang.String r16 = r7.getPath()     // Catch:{ all -> 0x0291 }
            java.lang.String r1 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x0291 }
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x0291 }
            android.util.Log.i(r8, r0)     // Catch:{ all -> 0x0291 }
            java.util.zip.ZipOutputStream r1 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x0281 }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0281 }
            r16 = r2
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0281 }
            r2.<init>(r7)     // Catch:{ all -> 0x0281 }
            r0.<init>(r2)     // Catch:{ all -> 0x0281 }
            r1.<init>(r0)     // Catch:{ all -> 0x0281 }
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0278 }
            java.lang.String r2 = "classes.dex"
            r0.<init>(r2)     // Catch:{ all -> 0x0278 }
            r2 = r9
            r17 = r10
            long r9 = r11.getTime()     // Catch:{ all -> 0x0276 }
            r0.setTime(r9)     // Catch:{ all -> 0x0276 }
            r1.putNextEntry(r0)     // Catch:{ all -> 0x0276 }
            r0 = 16384(0x4000, float:2.2959E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0276 }
            int r9 = r15.read(r0)     // Catch:{ all -> 0x0276 }
        L_0x0149:
            r10 = -1
            if (r9 == r10) goto L_0x0155
            r10 = 0
            r1.write(r0, r10, r9)     // Catch:{ all -> 0x0276 }
            int r9 = r15.read(r0)     // Catch:{ all -> 0x0276 }
            goto L_0x0149
        L_0x0155:
            r10 = 0
            r1.closeEntry()     // Catch:{ all -> 0x0276 }
            r1.close()     // Catch:{ all -> 0x027f }
            boolean r0 = r7.setReadOnly()     // Catch:{ all -> 0x027f }
            if (r0 == 0) goto L_0x024a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x027f }
            r0.<init>()     // Catch:{ all -> 0x027f }
            java.lang.String r1 = "Renaming to "
            r0.append(r1)     // Catch:{ all -> 0x027f }
            java.lang.String r1 = r13.getPath()     // Catch:{ all -> 0x027f }
            r0.append(r1)     // Catch:{ all -> 0x027f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x027f }
            android.util.Log.i(r8, r0)     // Catch:{ all -> 0x027f }
            boolean r0 = r7.renameTo(r13)     // Catch:{ all -> 0x027f }
            if (r0 == 0) goto L_0x021e
            m136f(r15)     // Catch:{ all -> 0x028b }
            r7.delete()     // Catch:{ all -> 0x028b }
            r1 = 1
            r9 = r11
            long r10 = m133c(r13)     // Catch:{ IOException -> 0x0190 }
            r13.f326a = r10     // Catch:{ IOException -> 0x0190 }
            r0 = 1
            goto L_0x01aa
        L_0x0190:
            r0 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x028b }
            r7.<init>()     // Catch:{ all -> 0x028b }
            java.lang.String r10 = "Failed to read crc from "
            r7.append(r10)     // Catch:{ all -> 0x028b }
            java.lang.String r10 = r13.getAbsolutePath()     // Catch:{ all -> 0x028b }
            r7.append(r10)     // Catch:{ all -> 0x028b }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x028b }
            android.util.Log.w(r8, r7, r0)     // Catch:{ all -> 0x028b }
            r0 = 0
        L_0x01aa:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x028b }
            r7.<init>()     // Catch:{ all -> 0x028b }
            java.lang.String r10 = "Extraction "
            r7.append(r10)     // Catch:{ all -> 0x028b }
            if (r1 == r0) goto L_0x01b9
            java.lang.String r1 = "failed"
            goto L_0x01bb
        L_0x01b9:
            java.lang.String r1 = "succeeded"
        L_0x01bb:
            r7.append(r1)     // Catch:{ all -> 0x028b }
            java.lang.String r1 = " '"
            r7.append(r1)     // Catch:{ all -> 0x028b }
            java.lang.String r1 = r13.getAbsolutePath()     // Catch:{ all -> 0x028b }
            r7.append(r1)     // Catch:{ all -> 0x028b }
            java.lang.String r1 = "': length "
            r7.append(r1)     // Catch:{ all -> 0x028b }
            long r10 = r13.length()     // Catch:{ all -> 0x028b }
            r7.append(r10)     // Catch:{ all -> 0x028b }
            java.lang.String r1 = " - crc: "
            r7.append(r1)     // Catch:{ all -> 0x028b }
            long r10 = r13.f326a     // Catch:{ all -> 0x028b }
            r7.append(r10)     // Catch:{ all -> 0x028b }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x028b }
            android.util.Log.i(r8, r1)     // Catch:{ all -> 0x028b }
            if (r0 != 0) goto L_0x020f
            r13.delete()     // Catch:{ all -> 0x028b }
            boolean r1 = r13.exists()     // Catch:{ all -> 0x028b }
            if (r1 == 0) goto L_0x020f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x028b }
            r1.<init>()     // Catch:{ all -> 0x028b }
            java.lang.String r7 = "Failed to delete corrupted secondary dex '"
            r1.append(r7)     // Catch:{ all -> 0x028b }
            java.lang.String r7 = r13.getPath()     // Catch:{ all -> 0x028b }
            r1.append(r7)     // Catch:{ all -> 0x028b }
            java.lang.String r7 = "'"
            r1.append(r7)     // Catch:{ all -> 0x028b }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x028b }
            android.util.Log.w(r8, r1)     // Catch:{ all -> 0x028b }
        L_0x020f:
            r1 = r19
            r11 = r9
            r10 = r17
            r9 = r2
            r2 = r16
            r18 = r14
            r14 = r0
            r0 = r18
            goto L_0x00f2
        L_0x021e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x027f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x027f }
            r1.<init>()     // Catch:{ all -> 0x027f }
            java.lang.String r2 = "Failed to rename \""
            r1.append(r2)     // Catch:{ all -> 0x027f }
            java.lang.String r2 = r7.getAbsolutePath()     // Catch:{ all -> 0x027f }
            r1.append(r2)     // Catch:{ all -> 0x027f }
            java.lang.String r2 = "\" to \""
            r1.append(r2)     // Catch:{ all -> 0x027f }
            java.lang.String r2 = r13.getAbsolutePath()     // Catch:{ all -> 0x027f }
            r1.append(r2)     // Catch:{ all -> 0x027f }
            java.lang.String r2 = "\""
            r1.append(r2)     // Catch:{ all -> 0x027f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x027f }
            r0.<init>(r1)     // Catch:{ all -> 0x027f }
            throw r0     // Catch:{ all -> 0x027f }
        L_0x024a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x027f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x027f }
            r1.<init>()     // Catch:{ all -> 0x027f }
            java.lang.String r2 = "Failed to mark readonly \""
            r1.append(r2)     // Catch:{ all -> 0x027f }
            java.lang.String r2 = r7.getAbsolutePath()     // Catch:{ all -> 0x027f }
            r1.append(r2)     // Catch:{ all -> 0x027f }
            java.lang.String r2 = "\" (tmp of \""
            r1.append(r2)     // Catch:{ all -> 0x027f }
            java.lang.String r2 = r13.getAbsolutePath()     // Catch:{ all -> 0x027f }
            r1.append(r2)     // Catch:{ all -> 0x027f }
            java.lang.String r2 = "\")"
            r1.append(r2)     // Catch:{ all -> 0x027f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x027f }
            r0.<init>(r1)     // Catch:{ all -> 0x027f }
            throw r0     // Catch:{ all -> 0x027f }
        L_0x0276:
            r0 = move-exception
            goto L_0x027b
        L_0x0278:
            r0 = move-exception
            r17 = r10
        L_0x027b:
            r1.close()     // Catch:{ all -> 0x027f }
            throw r0     // Catch:{ all -> 0x027f }
        L_0x027f:
            r0 = move-exception
            goto L_0x0284
        L_0x0281:
            r0 = move-exception
            r17 = r10
        L_0x0284:
            m136f(r15)     // Catch:{ all -> 0x028b }
            r7.delete()     // Catch:{ all -> 0x028b }
            throw r0     // Catch:{ all -> 0x028b }
        L_0x028b:
            r0 = move-exception
            r2 = r0
            r1 = r17
            goto L_0x0304
        L_0x0291:
            r0 = move-exception
            r2 = r0
            r1 = r10
            goto L_0x0304
        L_0x0296:
            r16 = r2
            r2 = r9
            r17 = r10
            goto L_0x02a3
        L_0x029c:
            r16 = r2
            r2 = r9
            r17 = r10
            if (r14 == 0) goto L_0x02c9
        L_0x02a3:
            int r12 = r12 + 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c5 }
            r0.<init>()     // Catch:{ all -> 0x02c5 }
            r0.append(r5)     // Catch:{ all -> 0x02c5 }
            r0.append(r12)     // Catch:{ all -> 0x02c5 }
            r0.append(r3)     // Catch:{ all -> 0x02c5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02c5 }
            r1 = r17
            java.util.zip.ZipEntry r11 = r1.getEntry(r0)     // Catch:{ all -> 0x02f3 }
            r10 = r1
            r9 = r2
            r2 = r16
            r1 = r19
            goto L_0x00be
        L_0x02c5:
            r0 = move-exception
            r1 = r17
            goto L_0x0303
        L_0x02c9:
            r1 = r17
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x02f3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02f3 }
            r2.<init>()     // Catch:{ all -> 0x02f3 }
            java.lang.String r3 = "Could not create zip file "
            r2.append(r3)     // Catch:{ all -> 0x02f3 }
            java.lang.String r3 = r13.getAbsolutePath()     // Catch:{ all -> 0x02f3 }
            r2.append(r3)     // Catch:{ all -> 0x02f3 }
            java.lang.String r3 = " for secondary dex ("
            r2.append(r3)     // Catch:{ all -> 0x02f3 }
            r2.append(r12)     // Catch:{ all -> 0x02f3 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x02f3 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x02f3 }
            r0.<init>(r2)     // Catch:{ all -> 0x02f3 }
            throw r0     // Catch:{ all -> 0x02f3 }
        L_0x02f3:
            r0 = move-exception
            goto L_0x0303
        L_0x02f5:
            r2 = r9
            r1 = r10
            r1.close()     // Catch:{ IOException -> 0x02fb }
            goto L_0x0300
        L_0x02fb:
            r0 = move-exception
            r1 = r0
            android.util.Log.w(r8, r4, r1)
        L_0x0300:
            return r2
        L_0x0301:
            r0 = move-exception
            r1 = r10
        L_0x0303:
            r2 = r0
        L_0x0304:
            r1.close()     // Catch:{ IOException -> 0x0308 }
            goto L_0x030d
        L_0x0308:
            r0 = move-exception
            r1 = r0
            android.util.Log.w(r8, r4, r1)
        L_0x030d:
            goto L_0x030f
        L_0x030e:
            throw r2
        L_0x030f:
            goto L_0x030e
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028c.C0128d.m135e():java.util.List");
    }

    /* renamed from: f */
    private static void m136f(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    /* renamed from: g */
    private static void m137g(Context context, long j, long j2, List list) {
        SharedPreferences.Editor edit = m134d(context).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            C0127c cVar = (C0127c) it.next();
            edit.putLong("dex.crc." + i, cVar.f326a);
            edit.putLong("dex.time." + i, cVar.lastModified());
            i++;
        }
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo97a(Context context, boolean z) {
        List list;
        List list2;
        C0128d dVar = this;
        boolean z2 = z;
        Log.i("MultiDex", "MultiDexExtractor.load(" + dVar.f327a.getPath() + ", " + z2 + ", )");
        if (dVar.f332f.isValid()) {
            if (!z2) {
                File file = dVar.f327a;
                long j = dVar.f328b;
                SharedPreferences d = m134d(context);
                long j2 = -1;
                if (d.getLong("timestamp", -1) == m132b(file) && d.getLong("crc", -1) == j) {
                    try {
                        Log.i("MultiDex", "loading existing secondary dex files");
                        String concat = String.valueOf(dVar.f327a.getName()).concat(".classes");
                        SharedPreferences d2 = m134d(context);
                        int i = d2.getInt("dex.number", 1);
                        list = new ArrayList(i - 1);
                        int i2 = 2;
                        while (i2 <= i) {
                            C0127c cVar = new C0127c(dVar.f329c, concat + i2 + ".zip");
                            if (cVar.isFile()) {
                                cVar.f326a = m133c(cVar);
                                long j3 = d2.getLong(BuildConfig.FLAVOR + "dex.crc." + i2, j2);
                                long j4 = d2.getLong(BuildConfig.FLAVOR + "dex.time." + i2, j2);
                                long lastModified = cVar.lastModified();
                                if (j4 == lastModified) {
                                    String str = concat;
                                    if (j3 == cVar.f326a) {
                                        list.add(cVar);
                                        i2++;
                                        j2 = -1;
                                        dVar = this;
                                        concat = str;
                                    }
                                }
                                throw new IOException("Invalid extracted dex: " + cVar + " (key \"" + BuildConfig.FLAVOR + "\"), expected modification time: " + j4 + ", modification time: " + lastModified + ", expected crc: " + j3 + ", file crc: " + cVar.f326a);
                            }
                            throw new IOException("Missing extracted secondary dex file '" + cVar.getPath() + "'");
                        }
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                        list2 = m135e();
                        m137g(context, m132b(this.f327a), this.f328b, list2);
                    }
                    Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
                    return list;
                }
                Log.i("MultiDex", "Detected that extraction must be performed.");
            } else {
                Log.i("MultiDex", "Forced extraction must be performed.");
            }
            list2 = m135e();
            m137g(context, m132b(dVar.f327a), dVar.f328b, list2);
            list = list2;
            Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    public final void close() {
        this.f332f.release();
        this.f331e.close();
        this.f330d.close();
    }
}
