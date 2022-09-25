package com.google.ads.interactivemedia.p367v3.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p3186j$.wrapper.java.p3189io.FileInputStreamWrapper;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abt */
/* compiled from: PG */
public final class abt extends abr {

    /* renamed from: a */
    private final ContentResolver f20215a;

    /* renamed from: b */
    private Uri f20216b;

    /* renamed from: c */
    private AssetFileDescriptor f20217c;

    /* renamed from: d */
    private FileInputStream f20218d;

    /* renamed from: e */
    private long f20219e;

    /* renamed from: f */
    private boolean f20220f;

    public abt(Context context) {
        super(false);
        this.f20215a = context.getContentResolver();
    }

    /* renamed from: a */
    public final int mo14388a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f20219e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new abs(e);
            }
        }
        FileInputStream fileInputStream = this.f20218d;
        int i3 = aeu.f20466a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f20219e;
            if (j2 != -1) {
                this.f20219e = j2 - ((long) read);
            }
            mo14406i(read);
            return read;
        } else if (this.f20219e == -1) {
            return -1;
        } else {
            throw new abs(new EOFException());
        }
    }

    /* renamed from: c */
    public final long mo14389c(acb acb) {
        try {
            Uri uri = acb.f20241a;
            this.f20216b = uri;
            mo14404g(acb);
            AssetFileDescriptor openAssetFileDescriptor = this.f20215a.openAssetFileDescriptor(uri, C33259r.f88929b);
            this.f20217c = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f20218d = fileInputStream;
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(acb.f20245e + startOffset) - startOffset;
                if (skip == acb.f20245e) {
                    long j = acb.f20246f;
                    if (j != -1) {
                        this.f20219e = j;
                    } else {
                        long length = openAssetFileDescriptor.getLength();
                        if (length == -1) {
                            FileChannel channel = FileInputStreamWrapper.getChannel(fileInputStream);
                            long size = channel.size();
                            if (size == 0) {
                                this.f20219e = -1;
                            } else {
                                long position = size - channel.position();
                                this.f20219e = position;
                                if (position < 0) {
                                    throw new EOFException();
                                }
                            }
                        } else {
                            long j2 = length - skip;
                            this.f20219e = j2;
                            if (j2 < 0) {
                                throw new EOFException();
                            }
                        }
                    }
                    this.f20220f = true;
                    mo14405h(acb);
                    return this.f20219e;
                }
                throw new EOFException();
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Could not open file descriptor for: ");
            sb.append(valueOf);
            throw new FileNotFoundException(sb.toString());
        } catch (IOException e) {
            throw new abs(e);
        }
    }

    /* renamed from: d */
    public final Uri mo14390d() {
        return this.f20216b;
    }

    /* renamed from: f */
    public final void mo14391f() {
        this.f20216b = null;
        try {
            FileInputStream fileInputStream = this.f20218d;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f20218d = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f20217c;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f20217c = null;
                if (this.f20220f) {
                    this.f20220f = false;
                    mo14407j();
                }
            } catch (IOException e) {
                throw new abs(e);
            } catch (Throwable th) {
                this.f20217c = null;
                if (this.f20220f) {
                    this.f20220f = false;
                    mo14407j();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new abs(e2);
        } catch (Throwable th2) {
            this.f20218d = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f20217c;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f20217c = null;
                if (this.f20220f) {
                    this.f20220f = false;
                    mo14407j();
                }
                throw th2;
            } catch (IOException e3) {
                throw new abs(e3);
            } catch (Throwable th3) {
                this.f20217c = null;
                if (this.f20220f) {
                    this.f20220f = false;
                    mo14407j();
                }
                throw th3;
            }
        }
    }
}
