package androidx.media3.extractor.metadata.emsg;

import com.evernote.android.state.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: androidx.media3.extractor.metadata.emsg.c */
/* compiled from: PG */
public final class C3591c {

    /* renamed from: a */
    private final ByteArrayOutputStream f11434a;

    /* renamed from: b */
    private final DataOutputStream f11435b;

    public C3591c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f11434a = byteArrayOutputStream;
        this.f11435b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    private static void m10389b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public final byte[] mo7505a(EventMessage eventMessage) {
        this.f11434a.reset();
        try {
            m10389b(this.f11435b, eventMessage.f11428a);
            String str = eventMessage.f11429b;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            m10389b(this.f11435b, str);
            this.f11435b.writeLong(eventMessage.f11430c);
            this.f11435b.writeLong(eventMessage.f11431d);
            this.f11435b.write(eventMessage.f11432e);
            this.f11435b.flush();
            return this.f11434a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
