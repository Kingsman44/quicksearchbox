package com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10187b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134285e;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134286f;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134287g;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134288h;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134289i;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134290j;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134291k;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134292l;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134295o;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134298r;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134299s;
import com.google.protobuf.C62957cd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p5462h.C69677g;
import p5462h.p5463a.C69495al;
import p5462h.p5463a.C69518bh;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69734n;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.a.b.a */
/* compiled from: PG */
public final class C134267a {

    /* renamed from: a */
    public static final C134267a f365767a;

    /* renamed from: b */
    public static final C134267a f365768b;

    /* renamed from: c */
    public static final C134267a f365769c;

    /* renamed from: d */
    private final C134296p f365770d;

    static {
        C69664n.m101060f(C134296p.f365809d, "MAX_SENSITIVITY_IN_SILENT_FEEDBACK");
        C134296p pVar = C134296p.f365810e;
        C69664n.m101060f(pVar, "MAX_SENSITIVITY_IN_MANUAL_FEEDBACK");
        f365767a = new C134267a(pVar);
        C134296p pVar2 = C134296p.f365812g;
        C69664n.m101060f(pVar2, "MAX_SENSITIVITY_IN_MANUA…_DETAILED_LOGGING_CONSENT");
        f365768b = new C134267a(pVar2);
        C134296p pVar3 = C134296p.f365811f;
        C69664n.m101060f(pVar3, "MAX_SENSITIVITY_IN_BUG_REPORTS");
        f365769c = new C134267a(pVar3);
    }

    private C134267a(C134296p pVar) {
        this.f365770d = pVar;
    }

    /* renamed from: b */
    private final String m217843b(C134295o oVar) {
        if (oVar.mo111675a().f365814h > this.f365770d.f365814h) {
            return "[REDACTED]";
        }
        if (oVar instanceof C134298r) {
            return ((C134298r) oVar).f365815a;
        }
        if (oVar instanceof C134285e) {
            return String.valueOf(((C134285e) oVar).f365789a);
        }
        if (oVar instanceof C134290j) {
            return String.valueOf(((C134290j) oVar).f365800a);
        }
        if (oVar instanceof C134292l) {
            C134292l lVar = (C134292l) oVar;
            throw null;
        } else if (oVar instanceof C134288h) {
            return String.valueOf(((C134288h) oVar).f365795a);
        } else {
            if (oVar instanceof C134299s) {
                String instant = ((C134299s) oVar).f365818a.toString();
                C69664n.m101060f(instant, "value.toString()");
                return instant;
            } else if (oVar instanceof C134287g) {
                Enum enumR = ((C134287g) oVar).f365792a;
                if (!(enumR instanceof C62957cd)) {
                    return enumR.name();
                }
                String name = enumR.name();
                int number = ((C62957cd) enumR).getNumber();
                return name + "(" + number + ")";
            } else {
                throw new C69677g();
            }
        }
    }

    /* renamed from: c */
    private final void m217844c(StringBuilder sb, C134286f fVar, String str) {
        ArrayList arrayList;
        String str2;
        Iterator it;
        StringBuilder sb2 = sb;
        C134286f fVar2 = fVar;
        String str3 = str;
        char c = 10;
        if (fVar2 instanceof C134289i) {
            String b = fVar.mo111676b();
            sb2.append(str3 + b + ":");
            sb2.append(10);
            for (C134286f c2 : ((C134289i) fVar2).f365798a) {
                m217844c(sb2, c2, str3.concat("  "));
            }
        } else if (fVar2 instanceof C134291k) {
            String b2 = fVar.mo111676b();
            sb2.append(str3 + b2 + ":");
            sb2.append(10);
            for (List list : ((C134291k) fVar2).f365803a) {
                String concat = str3.concat("  ");
                C69664n.m101061g(list, "<this>");
                C69664n.m101061g(list, "<this>");
                if (!(list instanceof RandomAccess) || !(list instanceof List)) {
                    arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    C69664n.m101061g(it2, "iterator");
                    if (!it2.hasNext()) {
                        it = C69495al.f185917a;
                    } else {
                        it = C69734n.m101171a(new C69518bh(it2, (C69577g) null));
                    }
                    while (it.hasNext()) {
                        arrayList.add((List) it.next());
                    }
                } else {
                    int size = list.size();
                    arrayList = new ArrayList((size / 3) + (size % 3 == 0 ? 0 : 1));
                    int i = 0;
                    while (i >= 0 && i < size) {
                        int i2 = size - i;
                        if (i2 >= 3) {
                            i2 = 3;
                        }
                        ArrayList arrayList2 = new ArrayList(i2);
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(list.get(i3 + i));
                        }
                        arrayList.add(arrayList2);
                        i += 3;
                    }
                }
                int i4 = 0;
                for (Object next : arrayList) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        C69540x.m100952j();
                    }
                    List list2 = (List) next;
                    if (i4 == 0) {
                        str2 = concat;
                    } else {
                        str2 = concat.concat("  ");
                    }
                    sb2.append(str2);
                    int i6 = 0;
                    for (Object next2 : list2) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            C69540x.m100952j();
                        }
                        C134295o oVar = (C134295o) next2;
                        String b3 = oVar.mo111676b();
                        String b4 = m217843b(oVar);
                        sb2.append(b3 + ": " + b4);
                        if (i6 < list2.size() - 1) {
                            sb2.append(" | ");
                        }
                        i6 = i7;
                        c = 10;
                    }
                    sb2.append(c);
                    i4 = i5;
                }
            }
        } else if (fVar2 instanceof C134295o) {
            String b5 = fVar.mo111676b();
            String b6 = m217843b((C134295o) fVar2);
            sb2.append(str3 + b5 + ": " + b6);
            sb2.append(10);
        }
    }

    /* renamed from: a */
    public final String mo111670a(C134286f fVar) {
        C69664n.m101061g(fVar, "feature");
        StringBuilder sb = new StringBuilder();
        m217844c(sb, fVar, BuildConfig.FLAVOR);
        return sb.toString();
    }
}
