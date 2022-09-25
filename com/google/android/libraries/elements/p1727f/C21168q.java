package com.google.android.libraries.elements.p1727f;

import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.p097i.C1967b;
import com.facebook.litho.C6110au;
import com.facebook.litho.C6201du;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.p313c.C6050i;
import com.facebook.p313c.C6051j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21279bv;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21359t;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63041ff;
import com.google.protobuf.C63042fg;
import com.google.protos.youtube.elements.C66063ay;
import com.google.protos.youtube.elements.C66124bc;
import com.google.protos.youtube.elements.C66128bg;
import com.google.protos.youtube.elements.C66166ck;
import com.google.protos.youtube.elements.C66172cq;
import com.google.protos.youtube.elements.C66208dv;
import com.google.protos.youtube.elements.p5166b.C66085as;
import com.google.protos.youtube.elements.p5166b.C66086at;
import com.google.protos.youtube.elements.p5166b.C66099d;
import com.google.protos.youtube.elements.p5166b.C66100e;
import com.google.protos.youtube.elements.p5166b.C66101f;
import com.google.protos.youtube.elements.p5166b.C66104i;
import com.google.protos.youtube.elements.p5166b.C66105j;
import com.youtube.p5283a.p5284a.C68039ab;
import com.youtube.p5283a.p5284a.C68045ah;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.elements.f.q */
/* compiled from: PG */
public final class C21168q {

    /* renamed from: a */
    public static final /* synthetic */ int f59372a = 0;

    /* renamed from: b */
    private static final AtomicInteger f59373b = new AtomicInteger();

    /* renamed from: c */
    private static final C62921ba f59374c;

    /* renamed from: d */
    private static final C62921ba f59375d;

    static {
        C62921ba baVar = new C62921ba();
        baVar.mo58832e(C66099d.f179743d);
        f59374c = baVar;
        C62921ba baVar2 = new C62921ba();
        baVar2.mo58832e(C66124bc.f179819d);
        baVar2.mo58832e(C66172cq.f179942d);
        f59375d = baVar2;
    }

    /* renamed from: a */
    public static C6110au m39747a(C6110au auVar, String str) {
        View view;
        Object obj;
        ComponentTree componentTree;
        C6050i iVar;
        C6407q qVar;
        if (auVar == null) {
            return null;
        }
        if (str.equals(auVar.mo12866k())) {
            return auVar;
        }
        if (C6407q.m17270A(auVar.f18041b.mo12936ai())) {
            if (auVar.mo12868n()) {
                C6411u aj = auVar.f18041b.mo12937aj();
                if (aj == null) {
                    componentTree = null;
                } else {
                    componentTree = aj.f19017j;
                }
                LithoView lithoView = componentTree == null ? null : componentTree.getLithoView();
                if (lithoView == null) {
                    iVar = null;
                } else {
                    iVar = lithoView.mo12745s();
                }
                if (iVar != null) {
                    int a = iVar.mo12627a();
                    int i = 0;
                    while (true) {
                        if (i < a) {
                            C6051j h = iVar.mo12629h(i);
                            if (h == null) {
                                qVar = null;
                            } else {
                                qVar = ((C6201du) h.f17806d.f17827b).f18345a.f18255e;
                            }
                            if (qVar != null && qVar == auVar.f18041b.mo12936ai()) {
                                obj = h.f17803a;
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                }
            }
            obj = null;
            view = (View) obj;
        } else {
            view = null;
        }
        if (view != null) {
            C6110au l = m39758l(view, str);
            if (l != null) {
                return l;
            }
        } else {
            for (C6110au a2 : auVar.mo12867l()) {
                C6110au a3 = m39747a(a2, str);
                if (a3 != null) {
                    return a3;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static LithoView m39748b(View view, String str) {
        if (view instanceof LithoView) {
            LithoView lithoView = (LithoView) view;
            if (str.equals(m39754h(lithoView))) {
                return lithoView;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            LithoView b = m39748b(viewGroup.getChildAt(i), str);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C58495hd m39749c(View view) {
        C58490gz gzVar = new C58490gz(4);
        m39757k(view, new C21167p(gzVar));
        return gzVar.mo55427f(true);
    }

    /* renamed from: d */
    public static C63042fg m39750d() {
        long currentTimeMillis = System.currentTimeMillis();
        C63041ff ffVar = (C63041ff) C63042fg.f170152c.createBuilder();
        ffVar.copyOnWrite();
        ((C63042fg) ffVar.instance).f170154a = currentTimeMillis / 1000;
        ffVar.copyOnWrite();
        ((C63042fg) ffVar.instance).f170155b = ((int) (currentTimeMillis % 1000)) * 1000000;
        return (C63042fg) ffVar.build();
    }

    /* renamed from: e */
    public static C66105j m39751e(C68039ab abVar, C21279bv bvVar, byte[] bArr, String str) {
        try {
            ByteBuffer k = C21359t.m40385k(abVar.mo60099m(), 287553821);
            if (k == null) {
                Log.w("Elements", "Failed to create debugger info: ELEMENT_SERIALIZED_PROTO_BYTES missing");
                return null;
            }
            C66166ck ckVar = (C66166ck) C62942bv.parseFrom((C62942bv) C66166ck.f179921e, k, C62921ba.m95368a());
            C66104i iVar = (C66104i) C66105j.f179759f.createBuilder();
            iVar.copyOnWrite();
            C66105j jVar = (C66105j) iVar.instance;
            ckVar.getClass();
            jVar.f179764d = ckVar;
            jVar.f179761a |= 4;
            if (bvVar != null) {
                C66128bg bgVar = (C66128bg) C62942bv.parseFrom((C62942bv) C66128bg.f179829a, bvVar.f59593c.duplicate(), C62921ba.m95368a());
                iVar.copyOnWrite();
                C66105j jVar2 = (C66105j) iVar.instance;
                bgVar.getClass();
                jVar2.f179763c = bgVar;
                jVar2.f179761a |= 2;
            }
            if (bArr != null) {
                C66063ay ayVar = (C66063ay) C62942bv.parseFrom((C62942bv) C66063ay.f179656a, bArr, f59375d);
                iVar.copyOnWrite();
                C66105j jVar3 = (C66105j) iVar.instance;
                ayVar.getClass();
                jVar3.f179765e = ayVar;
                jVar3.f179761a |= 8;
            }
            if (str != null) {
                iVar.copyOnWrite();
                C66105j jVar4 = (C66105j) iVar.instance;
                jVar4.f179761a |= 1;
                jVar4.f179762b = str;
            }
            return (C66105j) iVar.build();
        } catch (IOException e) {
            Log.w("Elements", "Failed to create debugger info: failed to parse ELEMENT_SERIALIZED_PROTO_BYTES", e);
            return null;
        }
    }

    /* renamed from: f */
    public static C66086at m39752f(C21319z zVar) {
        C66085as asVar = (C66085as) C66086at.f179707d.createBuilder();
        String num = Integer.toString(f59373b.getAndIncrement());
        asVar.copyOnWrite();
        C66086at atVar = (C66086at) asVar.instance;
        num.getClass();
        atVar.f179709a |= 2;
        atVar.f179711c = num;
        String o = zVar.mo26814o();
        String r = zVar.mo26817r();
        if (o == null || r == null) {
            return (C66086at) asVar.build();
        }
        C66100e eVar = (C66100e) C66101f.f179747d.createBuilder();
        eVar.copyOnWrite();
        C66101f fVar = (C66101f) eVar.instance;
        fVar.f179749a |= 2;
        fVar.f179751c = o;
        eVar.copyOnWrite();
        C66101f fVar2 = (C66101f) eVar.instance;
        fVar2.f179749a |= 1;
        fVar2.f179750b = r;
        asVar.copyOnWrite();
        C66086at atVar2 = (C66086at) asVar.instance;
        C66101f fVar3 = (C66101f) eVar.build();
        fVar3.getClass();
        atVar2.f179710b = fVar3;
        atVar2.f179709a |= 1;
        return (C66086at) asVar.build();
    }

    /* renamed from: g */
    public static String m39753g(C68045ah ahVar) {
        Object obj;
        if (ahVar == null) {
            return null;
        }
        try {
            ByteBuffer k = C21359t.m40385k(ahVar, 224886694);
            if (k == null) {
                Log.w("Elements", "Failed to get debugger id: PROPERTIES_SERIALIZED_PROTO_BYTES_ID missing");
                return null;
            }
            C66208dv dvVar = (C66208dv) C62942bv.parseFrom((C62942bv) C66208dv.f180040a, k, f59374c);
            C62940bt r2 = C62942bv.checkIsLite(C66099d.f179743d);
            dvVar.mo58887l(r2);
            if (!dvVar.f169962ag.mo58857o(r2.f169971d)) {
                Log.w("Elements", "Failed to get debugger id: DebuggerProperties missing");
                return null;
            }
            C62940bt r22 = C62942bv.checkIsLite(C66099d.f179743d);
            dvVar.mo58887l(r22);
            Object l = dvVar.f169962ag.mo58854l(r22.f169971d);
            if (l == null) {
                obj = r22.f169969b;
            } else {
                obj = r22.mo58889c(l);
            }
            C66099d dVar = (C66099d) obj;
            if ((dVar.f179745a & 2) != 0) {
                return dVar.f179746b;
            }
            Log.w("Elements", "Failed to get debugger id: DebuggerProperties.debugger_id missing");
            return null;
        } catch (IOException e) {
            Log.w("Elements", "Failed to get debugger id: failed to parse PROPERTIES_SERIALIZED_PROTO_BYTES_ID", e);
            return null;
        }
    }

    /* renamed from: h */
    public static String m39754h(View view) {
        Object tag = view.getTag(R.id.elements_tree_debug_id);
        if (!(tag instanceof String)) {
            return null;
        }
        return (String) tag;
    }

    /* renamed from: i */
    public static List m39755i() {
        List list;
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
            if (invoke == null) {
                list = C58485gu.m89845m();
            } else {
                Field declaredField = cls.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(invoke);
                if (obj == null) {
                    list = C58485gu.m89845m();
                } else if (obj instanceof List) {
                    list = (List) obj;
                } else if (obj instanceof View[]) {
                    list = Arrays.asList((Object[]) obj);
                } else {
                    list = C58485gu.m89845m();
                }
            }
        } catch (Exception e) {
            Log.w("ElementsDebugger", "Failed to get root views from WindowManager", e);
            list = C58485gu.m89845m();
        }
        for (Object next : list) {
            if (next instanceof View) {
                View view = (View) next;
                if (view.getWindowVisibility() == 0) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (((layoutParams instanceof WindowManager.LayoutParams) && (((WindowManager.LayoutParams) layoutParams).flags & 8) != 0) || view.hasWindowFocus()) {
                        arrayList.add(view);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static void m39756j(C6110au auVar, C1967b bVar, int[] iArr) {
        if (auVar != null) {
            bVar.mo3353a(Pair.create(iArr, auVar));
            for (C6110au j : auVar.mo12867l()) {
                m39756j(j, bVar, iArr);
            }
        }
    }

    /* renamed from: k */
    public static void m39757k(View view, C1967b bVar) {
        if (view != null) {
            if (view instanceof LithoView) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                m39756j(C6110au.m15899e((LithoView) view), bVar, iArr);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m39757k(viewGroup.getChildAt(i), bVar);
                }
            }
        }
    }

    /* renamed from: l */
    private static C6110au m39758l(View view, String str) {
        if (view == null) {
            return null;
        }
        if (view instanceof LithoView) {
            return m39747a(C6110au.m15899e((LithoView) view), str);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                C6110au l = m39758l(viewGroup.getChildAt(i), str);
                if (l != null) {
                    return l;
                }
            }
        }
        return null;
    }
}
