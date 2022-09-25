package p5462h.p5483m;

import p5462h.p5473f.p5474a.C69626l;

/* renamed from: h.m.n */
/* compiled from: PG */
class C69765n {
    /* renamed from: a */
    public static final void m101218a(Appendable appendable, Object obj, C69626l lVar) {
        if (lVar != null) {
            appendable.append((CharSequence) lVar.mo5761a(obj));
        } else if (obj == null || (obj instanceof CharSequence)) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }
}
