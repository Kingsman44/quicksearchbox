package android.p017a.p019b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.a.b.s */
/* compiled from: PG */
final class C0105s implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public boolean f291a = false;

    /* renamed from: b */
    public final List f292b = new ArrayList();

    /* renamed from: a */
    public final void mo63a(C0104r rVar) {
        String str = rVar.f287a;
        for (C0104r rVar2 : this.f292b) {
            if (str.equals(rVar2.f287a)) {
                throw new IllegalArgumentException("Duplicate keyword: ".concat(String.valueOf(str)));
            }
        }
        this.f292b.add(rVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (C0104r rVar : this.f292b) {
            if (sb.length() != 0) {
                sb.append(";  ");
            }
            sb.append(rVar);
        }
        return sb.toString();
    }
}
