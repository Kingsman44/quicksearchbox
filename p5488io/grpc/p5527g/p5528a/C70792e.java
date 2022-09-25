package p5488io.grpc.p5527g.p5528a;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: io.grpc.g.a.e */
/* compiled from: PG */
public final class C70792e {

    /* renamed from: a */
    public final List f188793a = new ArrayList(20);

    /* renamed from: a */
    public final void mo62497a(String str, String str2) {
        if (!str.isEmpty()) {
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt <= 31 || charAt >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i2), str}));
                }
            }
            if (str2 != null) {
                int length2 = str2.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    char charAt2 = str2.charAt(i3);
                    if (charAt2 <= 31 || charAt2 >= 127) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", new Object[]{Integer.valueOf(charAt2), Integer.valueOf(i3), str2}));
                    }
                }
                while (i < this.f188793a.size()) {
                    if (str.equalsIgnoreCase((String) this.f188793a.get(i))) {
                        this.f188793a.remove(i);
                        this.f188793a.remove(i);
                        i -= 2;
                    }
                    i += 2;
                }
                this.f188793a.add(str);
                this.f188793a.add(str2.trim());
                return;
            }
            throw new IllegalArgumentException("value == null");
        }
        throw new IllegalArgumentException("name is empty");
    }
}
