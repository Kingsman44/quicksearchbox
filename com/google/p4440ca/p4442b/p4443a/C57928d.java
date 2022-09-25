package com.google.p4440ca.p4442b.p4443a;

import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.ca.b.a.d */
/* compiled from: PG */
public final class C57928d {

    /* renamed from: a */
    public int f154940a;

    /* renamed from: b */
    private final C57925a f154941b;

    /* renamed from: c */
    private final String f154942c;

    static {
        " ".codePointAt(0);
    }

    public C57928d(String str, int i) {
        RandomAccessFile randomAccessFile;
        byte[] bArr = new byte[2];
        try {
            randomAccessFile = new RandomAccessFile(str, C33259r.f88929b);
            randomAccessFile.readFully(bArr);
            this.f154941b = new C57925a(bArr);
            randomAccessFile.close();
            this.f154942c = str;
            this.f154940a = i;
            return;
        } catch (IOException | IllegalArgumentException e) {
            throw new IOException("Wrong index file: ".concat(String.valueOf(str)), e);
        } catch (Throwable th) {
            C57926b.m88561a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    private final void m88562b(ArrayList arrayList, C57927c cVar) {
        int i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((C57927c) arrayList.get(size)).f154938c >= cVar.f154938c) {
                    i = size + 1;
                    break;
                }
            } else {
                i = 0;
                break;
            }
        }
        arrayList.add(i, cVar);
        if (arrayList.size() > this.f154940a) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* renamed from: c */
    private static final String m88563c(RandomAccessFile randomAccessFile) {
        int readByte = randomAccessFile.readByte() & 255;
        if (readByte == 0) {
            return null;
        }
        byte[] bArr = new byte[readByte];
        randomAccessFile.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* renamed from: d */
    private static final int m88564d(int i, RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[i];
        randomAccessFile.readFully(bArr);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 |= (bArr[i3] & 255) << (i3 * 8);
        }
        return i2;
    }

    /* renamed from: a */
    public final List mo54539a(String str) {
        RandomAccessFile randomAccessFile;
        C57927c cVar;
        C57927c cVar2;
        int i;
        ArrayList arrayList = new ArrayList();
        if (str.isEmpty()) {
            return arrayList;
        }
        try {
            randomAccessFile = new RandomAccessFile(this.f154942c, C33259r.f88929b);
            int i2 = 2;
            String str2 = null;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i3 < str.length()) {
                    if (i4 == 0) {
                        randomAccessFile.seek((long) i2);
                        if ((m88564d(this.f154941b.f154935b, randomAccessFile) & 1) == 1) {
                            randomAccessFile.skipBytes(this.f154941b.f154935b);
                        }
                        i4 = 0;
                        while (true) {
                            str2 = m88563c(randomAccessFile);
                            if (str2 != null) {
                                int d = m88564d(1, randomAccessFile);
                                int i6 = (d & 1) ^ 1;
                                if (i6 == 0) {
                                    i2 = ((m88564d(this.f154941b.f154934a - 1, randomAccessFile) << 8) | d) >>> 1;
                                } else {
                                    i5 = (d | (m88564d(this.f154941b.f154935b - 1, randomAccessFile) << 8)) >>> 1;
                                }
                                if (str.codePointAt(i3) == str2.codePointAt(0)) {
                                    i4 = i6;
                                    break;
                                }
                                i4 = i6;
                            } else {
                                str2 = null;
                                break;
                            }
                        }
                        if (str2 != null) {
                            if (!str.substring(i3).startsWith(str2) && !str2.startsWith(str.substring(i3))) {
                                break;
                            }
                            i3 += str2.length();
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    cVar = new C57927c();
                    String substring = str2.substring(str2.length() - (i3 - str.length()));
                    cVar.f154936a = String.valueOf(str).concat(String.valueOf(substring));
                    cVar.f154937b = 1 == i4;
                    cVar.f154939d = i2;
                    if (i4 == 0) {
                        randomAccessFile.seek((long) i2);
                        cVar.f154938c = m88564d(this.f154941b.f154935b, randomAccessFile) >>> 1;
                    } else {
                        cVar.f154938c = i5;
                    }
                    if (!substring.isEmpty()) {
                        substring.codePointAt(0);
                    }
                }
            }
            cVar = null;
            if (cVar != null) {
                ArrayList<C57927c> arrayList2 = new ArrayList<>();
                arrayList2.add(cVar);
                while (true) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList2.size()) {
                            cVar2 = null;
                            i = 0;
                            break;
                        } else if (!((C57927c) arrayList2.get(i7)).f154937b) {
                            cVar2 = (C57927c) arrayList2.get(i7);
                            arrayList2.remove(i7);
                            i = this.f154940a - i7;
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (cVar2 == null) {
                        break;
                    }
                    randomAccessFile.seek((long) cVar2.f154939d);
                    if ((m88564d(this.f154941b.f154935b, randomAccessFile) & 1) == 1) {
                        C57927c cVar3 = new C57927c();
                        cVar3.f154936a = cVar2.f154936a;
                        cVar3.f154938c = m88564d(this.f154941b.f154935b, randomAccessFile);
                        cVar3.f154937b = true;
                        m88562b(arrayList2, cVar3);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    while (true) {
                        if (i <= 0) {
                            break;
                        }
                        String c = m88563c(randomAccessFile);
                        if (c == null) {
                            break;
                        }
                        C57927c cVar4 = new C57927c();
                        cVar4.f154936a = String.valueOf(cVar2.f154936a).concat(c);
                        int d2 = m88564d(1, randomAccessFile);
                        int i8 = (d2 & 1) ^ 1;
                        if (i8 != 0) {
                            cVar4.f154938c = (d2 | (m88564d(this.f154941b.f154935b - 1, randomAccessFile) << 8)) >>> 1;
                        } else {
                            cVar4.f154939d = (d2 | (m88564d(this.f154941b.f154934a - 1, randomAccessFile) << 8)) >>> 1;
                        }
                        cVar4.f154937b = 1 == i8;
                        arrayList3.add(cVar4);
                        i--;
                    }
                    int size = arrayList3.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        C57927c cVar5 = (C57927c) arrayList3.get(i9);
                        if (!cVar5.f154937b) {
                            randomAccessFile.seek((long) cVar5.f154939d);
                            cVar5.f154938c = m88564d(this.f154941b.f154935b, randomAccessFile) >>> 1;
                        }
                        m88562b(arrayList2, cVar5);
                    }
                }
                for (C57927c cVar6 : arrayList2) {
                    arrayList.add(cVar6.f154936a);
                }
            }
            randomAccessFile.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            C57926b.m88561a(th, th);
        }
        return arrayList;
        throw th;
    }
}
