package p3186j$.nio.file;

import java.io.IOException;

/* renamed from: j$.nio.file.b */
public abstract class C40950b extends IOException {

    /* renamed from: a */
    private final String f107230a;

    /* renamed from: b */
    private final String f107231b;

    public C40950b(String str) {
        super((String) null);
        this.f107230a = str;
        this.f107231b = null;
    }

    public C40950b(String str, String str2, String str3) {
        super(str3);
        this.f107230a = str;
        this.f107231b = str2;
    }

    public final String getMessage() {
        String str = this.f107231b;
        String str2 = this.f107230a;
        if (str2 == null && str == null) {
            return super.getMessage();
        }
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
        }
        if (str != null) {
            sb.append(" -> ");
            sb.append(str);
        }
        if (super.getMessage() != null) {
            sb.append(": ");
            sb.append(super.getMessage());
        }
        return sb.toString();
    }
}
