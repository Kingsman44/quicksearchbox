package androidx.media3.p132b;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.p136b.C2612ak;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p3186j$.wrapper.java.p3189io.FileInputStreamWrapper;

/* renamed from: androidx.media3.b.f */
/* compiled from: PG */
public final class C2502f extends C2499c {

    /* renamed from: a */
    private final ContentResolver f6874a;

    /* renamed from: b */
    private Uri f6875b;

    /* renamed from: c */
    private AssetFileDescriptor f6876c;

    /* renamed from: d */
    private FileInputStream f6877d;

    /* renamed from: e */
    private long f6878e;

    /* renamed from: f */
    private boolean f6879f;

    public C2502f(Context context) {
        super(false);
        this.f6874a = context.getContentResolver();
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f6878e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C2501e(e, SimpleSnackbar.LENGTH_SHORT);
            }
        }
        FileInputStream fileInputStream = this.f6877d;
        int i3 = C2612ak.f7249a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f6878e;
        if (j2 != -1) {
            this.f6878e = j2 - ((long) read);
        }
        mo5927g(read);
        return read;
    }

    /* renamed from: b */
    public final long mo5880b(C2510n nVar) {
        AssetFileDescriptor assetFileDescriptor;
        long j;
        int i = SimpleSnackbar.LENGTH_SHORT;
        try {
            Uri uri = nVar.f6891a;
            this.f6875b = uri;
            mo5929i(nVar);
            if ("content".equals(nVar.f6891a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptor = this.f6874a.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptor = this.f6874a.openAssetFileDescriptor(uri, C33259r.f88929b);
            }
            this.f6876c = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.f6877d = fileInputStream;
                if (length != -1) {
                    if (nVar.f6896f > length) {
                        throw new C2501e((IOException) null, 2008);
                    }
                }
                long startOffset = assetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(nVar.f6896f + startOffset) - startOffset;
                if (skip == nVar.f6896f) {
                    if (length == -1) {
                        FileChannel channel = FileInputStreamWrapper.getChannel(fileInputStream);
                        long size = channel.size();
                        if (size == 0) {
                            this.f6878e = -1;
                            j = -1;
                        } else {
                            j = size - channel.position();
                            this.f6878e = j;
                            if (j < 0) {
                                throw new C2501e((IOException) null, 2008);
                            }
                        }
                    } else {
                        long j2 = length - skip;
                        this.f6878e = j2;
                        if (j2 >= 0) {
                            j = j2;
                        } else {
                            throw new C2501e((IOException) null, 2008);
                        }
                    }
                    long j3 = nVar.f6897g;
                    if (j3 != -1) {
                        if (j != -1) {
                            j3 = Math.min(j, j3);
                        }
                        this.f6878e = j3;
                    }
                    this.f6879f = true;
                    mo5930j(nVar);
                    long j4 = nVar.f6897g;
                    return j4 != -1 ? j4 : this.f6878e;
                }
                throw new C2501e((IOException) null, 2008);
            }
            throw new C2501e(new IOException("Could not open file descriptor for: " + String.valueOf(uri)), SimpleSnackbar.LENGTH_SHORT);
        } catch (C2501e e) {
            throw e;
        } catch (IOException e2) {
            if (true == (e2 instanceof FileNotFoundException)) {
                i = 2005;
            }
            throw new C2501e(e2, i);
        }
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        return this.f6875b;
    }

    /* renamed from: d */
    public final void mo5882d() {
        this.f6875b = null;
        try {
            FileInputStream fileInputStream = this.f6877d;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f6877d = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f6876c;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f6876c = null;
                if (this.f6879f) {
                    this.f6879f = false;
                    mo5928h();
                }
            } catch (IOException e) {
                throw new C2501e(e, SimpleSnackbar.LENGTH_SHORT);
            } catch (Throwable th) {
                this.f6876c = null;
                if (this.f6879f) {
                    this.f6879f = false;
                    mo5928h();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C2501e(e2, SimpleSnackbar.LENGTH_SHORT);
        } catch (Throwable th2) {
            this.f6877d = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f6876c;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f6876c = null;
                if (this.f6879f) {
                    this.f6879f = false;
                    mo5928h();
                }
                throw th2;
            } catch (IOException e3) {
                throw new C2501e(e3, SimpleSnackbar.LENGTH_SHORT);
            } catch (Throwable th3) {
                this.f6876c = null;
                if (this.f6879f) {
                    this.f6879f = false;
                    mo5928h();
                }
                throw th3;
            }
        }
    }
}
