package androidx.core.p095g;

import android.util.Base64;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: androidx.core.g.g */
/* compiled from: PG */
public final class C1909g {

    /* renamed from: a */
    public final String f5784a;

    /* renamed from: b */
    public final String f5785b;

    /* renamed from: c */
    public final String f5786c;

    /* renamed from: d */
    public final List f5787d;

    /* renamed from: e */
    public final int f5788e;

    /* renamed from: f */
    public final String f5789f;

    public C1909g(String str) {
        this.f5784a = "com.google.android.gms.fonts";
        this.f5785b = "com.google.android.gms";
        this.f5786c = str;
        this.f5787d = null;
        this.f5788e = R.array.com_google_android_gms_fonts_certs;
        this.f5789f = m5174a("com.google.android.gms.fonts", "com.google.android.gms", str);
    }

    /* renamed from: a */
    private static final String m5174a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f5784a + ", mProviderPackage: " + this.f5785b + ", mQuery: " + this.f5786c + ", mCertificates:");
        for (int i = 0; i < this.f5787d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f5787d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f5788e);
        return sb.toString();
    }

    public C1909g(String str, String str2, String str3, List list) {
        this.f5784a = str;
        this.f5785b = str2;
        this.f5786c = str3;
        list.getClass();
        this.f5787d = list;
        this.f5788e = 0;
        this.f5789f = m5174a(str, str2, str3);
    }
}
