package androidx.navigation;

import java.util.List;
import java.util.ListIterator;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69762k;

/* renamed from: androidx.navigation.ak */
/* compiled from: PG */
final class C3812ak implements Comparable {

    /* renamed from: a */
    public String f12318a;

    /* renamed from: b */
    public String f12319b;

    public C3812ak(String str) {
        List list;
        C69664n.m101061g(str, "mimeType");
        List a = new C69762k("/").mo61433a(str, 0);
        if (!a.isEmpty()) {
            ListIterator listIterator = a.listIterator(a.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        list = C69540x.m100838T(a, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        list = C69496am.f185918a;
        this.f12318a = (String) list.get(0);
        this.f12319b = (String) list.get(1);
    }

    /* renamed from: a */
    public final int compareTo(C3812ak akVar) {
        C69664n.m101061g(akVar, "other");
        int i = true != C69664n.m101066l(this.f12318a, akVar.f12318a) ? 0 : 2;
        return C69664n.m101066l(this.f12319b, akVar.f12319b) ? i + 1 : i;
    }
}
