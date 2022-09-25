package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.Base64;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7041h.C89776h;
import com.google.android.apps.gsa.shared.p7041h.C89778j;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3897e.p3921j.C52281ly;
import com.google.assistant.p3897e.p3921j.C52282lz;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53351kr;
import com.google.assistant.p3994s.p3995a.C53353kt;
import com.google.assistant.p3994s.p3995a.C53354ku;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.p5633c.p5634a.C72149ag;
import org.p5633c.p5634a.C72210d;
import org.p5633c.p5634a.C72285i;
import org.p5633c.p5634a.C72289m;
import org.p5633c.p5634a.C72298v;
import org.p5633c.p5634a.C72301y;
import org.p5633c.p5634a.p5639e.C72234a;
import org.p5633c.p5634a.p5639e.C72245b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.f */
/* compiled from: PG */
public final class C114874f {

    /* renamed from: a */
    private static final C59071e f318721a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.j.f");

    /* renamed from: b */
    private static final C72245b f318722b = C72234a.m106517a("a");

    /* renamed from: c */
    private static final C58881cr f318723c = C58886cw.m90973a(C114857d.f318655a);

    /* renamed from: a */
    public static C53354ku m190401a(C89776h hVar) {
        C52281ly lyVar = (C52281ly) C52282lz.f137236h.createBuilder();
        String str = hVar.f242984d;
        lyVar.copyOnWrite();
        C52282lz lzVar = (C52282lz) lyVar.instance;
        str.getClass();
        lzVar.f137238a |= 1;
        lzVar.f137239b = str;
        C52395qd a = C114802az.m190314a(hVar.f242985e, hVar.f242994n);
        lyVar.copyOnWrite();
        C52282lz lzVar2 = (C52282lz) lyVar.instance;
        a.getClass();
        lzVar2.f137240c = a;
        lzVar2.f137238a |= 2;
        C52395qd a2 = C114802az.m190314a(hVar.f242986f, hVar.f242994n);
        lyVar.copyOnWrite();
        C52282lz lzVar3 = (C52282lz) lyVar.instance;
        a2.getClass();
        lzVar3.f137241d = a2;
        lzVar3.f137238a |= 4;
        String str2 = hVar.f242987g;
        lyVar.copyOnWrite();
        C52282lz lzVar4 = (C52282lz) lyVar.instance;
        str2.getClass();
        lzVar4.f137238a |= 16;
        lzVar4.f137242e = str2;
        String format = String.format("content://com.android.calendar/events/%d", new Object[]{Long.valueOf(hVar.f242983c)});
        lyVar.copyOnWrite();
        C52282lz lzVar5 = (C52282lz) lyVar.instance;
        format.getClass();
        lzVar5.f137238a |= 32;
        lzVar5.f137243f = format;
        C52282lz lzVar6 = (C52282lz) lyVar.build();
        C53351kr krVar = (C53351kr) C53354ku.f139999d.createBuilder();
        krVar.copyOnWrite();
        C53354ku kuVar = (C53354ku) krVar.instance;
        lzVar6.getClass();
        kuVar.f140002b = lzVar6;
        kuVar.f140001a |= 1;
        return (C53354ku) krVar.build();
    }

    /* renamed from: b */
    public static C58833ax m190402b(C53354ku kuVar) {
        C52395qd qdVar;
        C58836b bVar = C58836b.f156633a;
        C52282lz lzVar = kuVar.f140002b;
        if (lzVar == null) {
            lzVar = C52282lz.f137236h;
        }
        if ((lzVar.f137238a & 32) != 0) {
            try {
                Intent parseUri = Intent.parseUri(lzVar.f137243f, 1);
                C52395qd qdVar2 = null;
                if ((lzVar.f137238a & 2) != 0) {
                    qdVar = lzVar.f137240c;
                    if (qdVar == null) {
                        qdVar = C52395qd.f137485e;
                    }
                } else {
                    qdVar = null;
                }
                C58833ax b = C114802az.m190315b(qdVar);
                if (b.mo56113h()) {
                    parseUri.putExtra("beginTime", ((C72210d) b.mo56107c()).f191962a);
                }
                if ((lzVar.f137238a & 4) != 0 && (qdVar2 = lzVar.f137241d) == null) {
                    qdVar2 = C52395qd.f137485e;
                }
                C58833ax b2 = C114802az.m190315b(qdVar2);
                if (b2.mo56113h()) {
                    parseUri.putExtra("endTime", ((C72210d) b2.mo56107c()).f191962a);
                }
                return C58833ax.m90834k(parseUri);
            } catch (URISyntaxException e) {
                ((C59052c) ((C59052c) ((C59052c) f318721a.mo56226d()).mo56382g(e)).mo56372aa(29517)).mo56389s("Trying to open invalid uri: %s", lzVar.f137243f);
                return bVar;
            }
        } else {
            int a = C53353kt.m86814a(kuVar.f140003c);
            if (a == 0 || a != 3) {
                return bVar;
            }
            C18509a c = C18522b.m35986c();
            ((C18523c) c).f52492a = "reminders";
            return C58833ax.m90834k(c.mo24020b().mo24031a());
        }
    }

    /* renamed from: c */
    public static C58833ax m190403c(List list, boolean z) {
        C52395qd qdVar;
        ArrayList arrayList = new ArrayList();
        C114830c cVar = new C114830c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C53354ku kuVar = (C53354ku) it.next();
            if (m190418r(kuVar) && !m190412l(kuVar)) {
                C52282lz lzVar = kuVar.f140002b;
                if (lzVar == null) {
                    lzVar = C52282lz.f137236h;
                }
                if (z) {
                    if ((lzVar.f137238a & 2) != 0) {
                        qdVar = lzVar.f137240c;
                        if (qdVar == null) {
                            qdVar = C52395qd.f137485e;
                        }
                    } else {
                        qdVar = null;
                    }
                    C58833ax b = C114802az.m190315b(qdVar);
                    if (b.mo56113h()) {
                        C72210d dVar = new C72210d();
                        int i = C72301y.m106867b(dVar, (C72149ag) b.mo56107c()).f191967k;
                        if (((C72210d) b.mo56107c()).mo63388s(C72285i.m106773a(dVar))) {
                            if (i >= 0) {
                                if (i >= 30) {
                                }
                            }
                        }
                    }
                } else if (!m190414n(lzVar) && !m190417q(lzVar)) {
                }
                arrayList.add(kuVar);
            }
        }
        if (arrayList.isEmpty()) {
            return C58836b.f156633a;
        }
        Collections.sort(arrayList, cVar);
        return C58833ax.m90834k((C53354ku) arrayList.get(0));
    }

    /* renamed from: d */
    public static String m190404d(C52282lz lzVar) {
        C52395qd qdVar;
        MessageDigest messageDigest = (MessageDigest) f318723c.mo6453a();
        String str = lzVar.f137239b;
        C52395qd qdVar2 = null;
        if ((lzVar.f137238a & 2) != 0) {
            qdVar = lzVar.f137240c;
            if (qdVar == null) {
                qdVar = C52395qd.f137485e;
            }
        } else {
            qdVar = null;
        }
        C58833ax b = C114802az.m190315b(qdVar);
        if ((lzVar.f137238a & 4) != 0 && (qdVar2 = lzVar.f137241d) == null) {
            qdVar2 = C52395qd.f137485e;
        }
        messageDigest.update(TextUtils.join("|", C58485gu.m89848p(str, b, C114802az.m190315b(qdVar2))).getBytes());
        return Base64.encodeToString(messageDigest.digest(), 3);
    }

    /* renamed from: e */
    public static String m190405e(Context context, C72210d dVar, boolean z, boolean z2) {
        String str;
        if (!DateFormat.is24HourFormat(context)) {
            if (z) {
                str = DateUtils.formatDateTime(context, dVar.f191962a, 1);
            } else {
                str = DateFormat.format("h:mm", dVar.f191962a).toString();
            }
            return z2 ? str.replace(":00", BuildConfig.FLAVOR) : str;
        } else if (z2) {
            return DateFormat.format("H:mm", dVar.f191962a).toString();
        } else {
            return DateFormat.format("HH:mm", dVar.f191962a).toString();
        }
    }

    /* renamed from: f */
    public static String m190406f(Context context, C52282lz lzVar) {
        return m190407g(context, lzVar, true, false, true);
    }

    /* renamed from: g */
    public static String m190407g(Context context, C52282lz lzVar, boolean z, boolean z2, boolean z3) {
        C52395qd qdVar;
        String str;
        String str2;
        C52395qd qdVar2 = null;
        if ((lzVar.f137238a & 2) != 0) {
            qdVar = lzVar.f137240c;
            if (qdVar == null) {
                qdVar = C52395qd.f137485e;
            }
        } else {
            qdVar = null;
        }
        C58833ax b = C114802az.m190315b(qdVar);
        boolean h = b.mo56113h();
        String str3 = BuildConfig.FLAVOR;
        if (h) {
            if ((lzVar.f137238a & 4) != 0 && (qdVar2 = lzVar.f137241d) == null) {
                qdVar2 = C52395qd.f137485e;
            }
            C58833ax b2 = C114802az.m190315b(qdVar2);
            if (b2.mo56113h()) {
                C72245b bVar = f318722b;
                if (bVar.mo63596b((C72149ag) b.mo56107c()).equals(bVar.mo63596b((C72149ag) b2.mo56107c()))) {
                    str2 = m190405e(context, (C72210d) b.mo56107c(), z2, z3);
                } else {
                    str2 = m190405e(context, (C72210d) b.mo56107c(), true, z3);
                }
                str = str2 + " - " + m190405e(context, (C72210d) b2.mo56107c(), true, z3);
            } else {
                str = m190405e(context, (C72210d) b.mo56107c(), true, z3);
            }
        } else {
            str = str3;
        }
        if (z && !lzVar.f137242e.isEmpty()) {
            str3 = ", ".concat(String.valueOf(lzVar.f137242e));
        }
        return String.valueOf(str).concat(str3);
    }

    /* renamed from: h */
    static /* synthetic */ MessageDigest m190408h() {
        try {
            return MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: i */
    public static List m190409i(C89778j jVar) {
        return m190410j(jVar.f242998a);
    }

    /* renamed from: j */
    public static List m190410j(List list) {
        C58480gp gpVar = new C58480gp(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gpVar.mo55395g(m190401a((C89776h) it.next()));
        }
        return gpVar.mo55394f();
    }

    /* renamed from: k */
    public static void m190411k(View view, C53354ku kuVar, C91097g gVar, Activity activity, C58833ax axVar, List list, C53306j jVar) {
        C28292j jVar2;
        C58833ax b = m190402b(kuVar);
        if (b.mo56113h()) {
            Intent intent = (Intent) b.mo56107c();
            if (jVar == C53306j.MAIN_APP) {
                jVar2 = new C28292j(49930);
                jVar2.mo33795i(5);
            } else if (jVar == C53306j.AMBIENT) {
                jVar2 = new C28292j(75940);
                jVar2.mo33795i(5);
            } else {
                jVar2 = null;
            }
            if (list != null) {
                list.add(C28293k.m52908e(jVar2, new C28293k[0]));
            }
            if (jVar2 != null) {
                C28295m.m52919e(view, jVar2);
            }
            view.setOnClickListener(new C89943l(new C114870dm(activity, axVar, new C114873e(gVar, intent), gVar)));
        }
    }

    /* renamed from: l */
    public static boolean m190412l(C53354ku kuVar) {
        C52282lz lzVar = kuVar.f140002b;
        if (lzVar == null) {
            lzVar = C52282lz.f137236h;
        }
        C52395qd qdVar = lzVar.f137240c;
        if (qdVar == null) {
            qdVar = C52395qd.f137485e;
        }
        return (qdVar.f137487a & 2) == 0;
    }

    /* renamed from: m */
    public static boolean m190413m(C52282lz lzVar) {
        C52395qd qdVar;
        C52395qd qdVar2 = null;
        if ((lzVar.f137238a & 2) != 0) {
            qdVar = lzVar.f137240c;
            if (qdVar == null) {
                qdVar = C52395qd.f137485e;
            }
        } else {
            qdVar = null;
        }
        C58833ax b = C114802az.m190315b(qdVar);
        if (b.mo56113h()) {
            if ((lzVar.f137238a & 4) != 0 && (qdVar2 = lzVar.f137241d) == null) {
                qdVar2 = C52395qd.f137485e;
            }
            C58833ax b2 = C114802az.m190315b(qdVar2);
            C72210d g = new C72210d().mo63549g();
            C72289m c = C72289m.m106807c(new C72298v(), ((C72210d) b.mo56107c()).mo63548f());
            boolean s = b2.mo56113h() ? ((C72210d) b2.mo56107c()).mo63388s(C72285i.m106773a(new C72210d())) : true;
            if (!c.mo63670f(C72289m.f192425b) || !((C72210d) b.mo56107c()).mo63388s(C72285i.m106773a(g)) || !s) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m190414n(C52282lz lzVar) {
        C52395qd qdVar;
        if ((lzVar.f137238a & 2) != 0) {
            qdVar = lzVar.f137240c;
            if (qdVar == null) {
                qdVar = C52395qd.f137485e;
            }
        } else {
            qdVar = null;
        }
        C58833ax b = C114802az.m190315b(qdVar);
        if (b.mo56113h()) {
            C72210d dVar = new C72210d();
            C72210d d = dVar.mo63546d(dVar.f191963b.mo63332J().mo63673f(dVar.f191962a, 5));
            if (!C72289m.m106807c(new C72298v(), ((C72210d) b.mo56107c()).mo63548f()).mo63670f(C72289m.f192425b) || !((C72210d) b.mo56107c()).mo63388s(C72285i.m106773a(d))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m190415o(C53354ku kuVar) {
        C52395qd qdVar;
        C52282lz lzVar = kuVar.f140002b;
        if (lzVar == null) {
            lzVar = C52282lz.f137236h;
        }
        if ((lzVar.f137238a & 2) != 0) {
            C52282lz lzVar2 = kuVar.f140002b;
            if (lzVar2 == null) {
                lzVar2 = C52282lz.f137236h;
            }
            qdVar = lzVar2.f137240c;
            if (qdVar == null) {
                qdVar = C52395qd.f137485e;
            }
        } else {
            qdVar = null;
        }
        C58833ax b = C114802az.m190315b(qdVar);
        C72210d g = new C72210d().mo63549g();
        int a = C53353kt.m86814a(kuVar.f140003c);
        if (a != 0 && a == 3) {
            return !b.mo56113h() || ((C72210d) b.mo56107c()).mo63389t(C72285i.m106773a(g));
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m190416p(C52282lz lzVar) {
        C52395qd qdVar;
        if ((lzVar.f137238a & 2) != 0) {
            qdVar = lzVar.f137240c;
            if (qdVar == null) {
                qdVar = C52395qd.f137485e;
            }
        } else {
            qdVar = null;
        }
        C58833ax b = C114802az.m190315b(qdVar);
        if (!b.mo56113h()) {
            return false;
        }
        return new C72210d().mo63544b().equals(((C72210d) b.mo56107c()).mo63544b());
    }

    /* renamed from: q */
    public static boolean m190417q(C52282lz lzVar) {
        C52395qd qdVar;
        if ((lzVar.f137238a & 2) != 0) {
            qdVar = lzVar.f137240c;
            if (qdVar == null) {
                qdVar = C52395qd.f137485e;
            }
        } else {
            qdVar = null;
        }
        C58833ax b = C114802az.m190315b(qdVar);
        if (!b.mo56113h()) {
            return false;
        }
        return C72289m.m106807c(new C72298v(), ((C72210d) b.mo56107c()).mo63548f()).equals(C72289m.f192425b);
    }

    /* renamed from: r */
    public static boolean m190418r(C53354ku kuVar) {
        if ((kuVar.f140001a & 1) == 0) {
            return false;
        }
        C52282lz lzVar = kuVar.f140002b;
        if (lzVar == null) {
            lzVar = C52282lz.f137236h;
        }
        if (lzVar.f137239b.isEmpty()) {
            return false;
        }
        C52282lz lzVar2 = kuVar.f140002b;
        if (lzVar2 == null) {
            lzVar2 = C52282lz.f137236h;
        }
        if ((lzVar2.f137238a & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static boolean m190419s(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C53354ku kuVar = (C53354ku) it.next();
            if (m190418r(kuVar) && !m190412l(kuVar)) {
                C52282lz lzVar = kuVar.f140002b;
                if (lzVar == null) {
                    lzVar = C52282lz.f137236h;
                }
                if (m190414n(lzVar)) {
                    return true;
                }
                C52282lz lzVar2 = kuVar.f140002b;
                if (lzVar2 == null) {
                    lzVar2 = C52282lz.f137236h;
                }
                if (m190417q(lzVar2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
