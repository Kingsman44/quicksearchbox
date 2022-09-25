package androidx.media3.extractor.metadata.icy;

import androidx.media3.extractor.metadata.C3586c;
import com.google.common.base.C58913w;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Pattern;

/* renamed from: androidx.media3.extractor.metadata.icy.a */
/* compiled from: PG */
public final class C3594a extends C3586c {

    /* renamed from: a */
    private static final Pattern f11455a = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: b */
    private final CharsetDecoder f11456b = C58913w.f156754c.newDecoder();

    /* renamed from: c */
    private final CharsetDecoder f11457c = C58913w.f156753b.newDecoder();

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private final String m10404c(ByteBuffer byteBuffer) {
        try {
            return this.f11456b.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.f11457c.decode(byteBuffer).toString();
                this.f11457c.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.f11457c.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.f11457c.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f11456b.reset();
            byteBuffer.rewind();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.common.Metadata mo7492b(androidx.media3.extractor.metadata.C3585b r11, java.nio.ByteBuffer r12) {
        /*
            r10 = this;
            java.lang.String r11 = r10.m10404c(r12)
            int r0 = r12.limit()
            byte[] r0 = new byte[r0]
            r12.get(r0)
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            r3 = 0
            r4 = 1
            if (r11 != 0) goto L_0x0026
            androidx.media3.common.Metadata r11 = new androidx.media3.common.Metadata
            androidx.media3.common.Metadata$Entry[] r4 = new androidx.media3.common.Metadata.Entry[r4]
            androidx.media3.extractor.metadata.icy.IcyInfo r5 = new androidx.media3.extractor.metadata.icy.IcyInfo
            r5.<init>(r0, r3, r3)
            r4[r12] = r5
            r11.<init>(r1, r4)
            return r11
        L_0x0026:
            java.util.regex.Pattern r5 = f11455a
            java.util.regex.Matcher r11 = r5.matcher(r11)
            r5 = r3
            r6 = 0
        L_0x002e:
            boolean r6 = r11.find(r6)
            if (r6 == 0) goto L_0x0074
            java.lang.String r6 = r11.group(r4)
            r7 = 2
            java.lang.String r7 = r11.group(r7)
            if (r6 == 0) goto L_0x006f
            java.lang.String r6 = com.google.common.base.C58890d.m90988c(r6)
            int r8 = r6.hashCode()
            r9 = -315603473(0xffffffffed3045ef, float:-3.409619E27)
            if (r8 == r9) goto L_0x005c
            r9 = 1646559960(0x622482d8, float:7.586736E20)
            if (r8 == r9) goto L_0x0052
            goto L_0x0066
        L_0x0052:
            java.lang.String r8 = "streamtitle"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0066
            r6 = 0
            goto L_0x0067
        L_0x005c:
            java.lang.String r8 = "streamurl"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0066
            r6 = 1
            goto L_0x0067
        L_0x0066:
            r6 = -1
        L_0x0067:
            if (r6 == 0) goto L_0x006e
            if (r6 == r4) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            r5 = r7
            goto L_0x006f
        L_0x006e:
            r3 = r7
        L_0x006f:
            int r6 = r11.end()
            goto L_0x002e
        L_0x0074:
            androidx.media3.common.Metadata r11 = new androidx.media3.common.Metadata
            androidx.media3.common.Metadata$Entry[] r4 = new androidx.media3.common.Metadata.Entry[r4]
            androidx.media3.extractor.metadata.icy.IcyInfo r6 = new androidx.media3.extractor.metadata.icy.IcyInfo
            r6.<init>(r0, r3, r5)
            r4[r12] = r6
            r11.<init>(r1, r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.icy.C3594a.mo7492b(androidx.media3.extractor.metadata.b, java.nio.ByteBuffer):androidx.media3.common.Metadata");
    }
}
