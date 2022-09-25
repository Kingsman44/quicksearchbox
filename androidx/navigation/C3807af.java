package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.C0800m;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.C1815be;
import androidx.core.p094f.C1891d;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2390u;
import androidx.lifecycle.C2391v;
import androidx.p060c.C0985o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.C71521by;
import kotlinx.coroutines.p5574b.C71547cx;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71557dg;
import kotlinx.coroutines.p5574b.C71573dw;
import kotlinx.coroutines.p5574b.C71574dx;
import p5462h.C69613f;
import p5462h.C69685i;
import p5462h.C69747m;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69514bd;
import p5462h.p5463a.C69530n;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69644aa;
import p5462h.p5473f.p5475b.C69646ac;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69734n;

/* renamed from: androidx.navigation.af */
/* compiled from: PG */
public class C3807af {

    /* renamed from: A */
    private final List f12284A;

    /* renamed from: B */
    private final C69613f f12285B;

    /* renamed from: C */
    private final C71547cx f12286C;

    /* renamed from: a */
    public final Context f12287a;

    /* renamed from: b */
    public C3834bb f12288b;

    /* renamed from: c */
    public Bundle f12289c;

    /* renamed from: d */
    public Parcelable[] f12290d;

    /* renamed from: e */
    public boolean f12291e;

    /* renamed from: f */
    public final C69530n f12292f;

    /* renamed from: g */
    public final C71548cy f12293g;

    /* renamed from: h */
    public final Map f12294h;

    /* renamed from: i */
    public final Map f12295i;

    /* renamed from: j */
    public C2391v f12296j;

    /* renamed from: k */
    public OnBackPressedDispatcher f12297k;

    /* renamed from: l */
    public C3810ai f12298l;

    /* renamed from: m */
    public C2383n f12299m;

    /* renamed from: n */
    public final C2390u f12300n;

    /* renamed from: o */
    public final C0800m f12301o;

    /* renamed from: p */
    public boolean f12302p;

    /* renamed from: q */
    public C3870ck f12303q;

    /* renamed from: r */
    public final Map f12304r;

    /* renamed from: s */
    public C69626l f12305s;

    /* renamed from: t */
    public C69626l f12306t;

    /* renamed from: u */
    public final Map f12307u;

    /* renamed from: v */
    private Activity f12308v;

    /* renamed from: w */
    private final Map f12309w;

    /* renamed from: x */
    private final Map f12310x;

    /* renamed from: y */
    private final CopyOnWriteArrayList f12311y;

    /* renamed from: z */
    private int f12312z;

    public C3807af(Context context) {
        Object obj;
        C69664n.m101061g(context, "context");
        this.f12287a = context;
        Iterator a = C69734n.m101178d(context, C3897r.f12492a).mo5191a();
        while (true) {
            if (!a.hasNext()) {
                obj = null;
                break;
            }
            obj = a.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f12308v = (Activity) obj;
        this.f12292f = new C69530n();
        C71548cy b = C71574dx.m104480b(C69496am.f185918a);
        this.f12293g = b;
        C71521by.m104365c(b);
        this.f12309w = new LinkedHashMap();
        this.f12310x = new LinkedHashMap();
        this.f12294h = new LinkedHashMap();
        this.f12295i = new LinkedHashMap();
        this.f12311y = new CopyOnWriteArrayList();
        this.f12299m = C2383n.INITIALIZED;
        this.f12300n = new NavController$$ExternalSyntheticLambda0(this);
        this.f12301o = new C3903x(this);
        this.f12302p = true;
        this.f12303q = new C3870ck();
        this.f12304r = new LinkedHashMap();
        this.f12307u = new LinkedHashMap();
        C3870ck ckVar = this.f12303q;
        ckVar.mo8124b(new C3835bc(ckVar));
        this.f12303q.mo8124b(new C3874d(this.f12287a));
        this.f12284A = new ArrayList();
        this.f12285B = new C69747m(new C3901v(this));
        C71547cx e = C71557dg.m104447e(1, 0, C71387t.DROP_OLDEST, 2);
        this.f12286C = e;
        C71521by.m104363a(e);
    }

    /* renamed from: B */
    private final int m10989B() {
        C69530n<C3892m> nVar = this.f12292f;
        int i = 0;
        if (!nVar.isEmpty()) {
            for (C3892m mVar : nVar) {
                if ((!(mVar.f12477b instanceof C3834bb)) && (i = i + 1) < 0) {
                    C69540x.m100951i();
                }
            }
        }
        return i;
    }

    /* renamed from: C */
    private final void m10990C(C3892m mVar, C3892m mVar2) {
        this.f12309w.put(mVar, mVar2);
        if (this.f12310x.get(mVar2) == null) {
            this.f12310x.put(mVar2, new AtomicInteger(0));
        }
        Object obj = this.f12310x.get(mVar2);
        C69664n.m101058d(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* renamed from: D */
    private final void m10991D(C3868ci ciVar, List list, C3840bh bhVar, C3864ce ceVar, C69626l lVar) {
        this.f12305s = lVar;
        ciVar.mo8097d(list, bhVar, ceVar);
        this.f12305s = null;
    }

    /* renamed from: E */
    private final boolean m10992E(int i, Bundle bundle, C3840bh bhVar, C3864ce ceVar) {
        C3825ax axVar;
        String str;
        C3892m mVar;
        C3825ax axVar2;
        Map map = this.f12294h;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return false;
        }
        String str2 = (String) this.f12294h.get(valueOf);
        Collection values = this.f12294h.values();
        C3805ad adVar = new C3805ad(str2);
        C69664n.m101061g(values, "<this>");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (((Boolean) adVar.mo5761a(it.next())).booleanValue()) {
                it.remove();
            }
        }
        C69530n<NavBackStackEntryState> nVar = (C69530n) this.f12295i.remove(str2);
        ArrayList arrayList = new ArrayList();
        C3892m mVar2 = (C3892m) this.f12292f.mo61314f();
        if (mVar2 == null) {
            axVar = null;
        } else {
            axVar = mVar2.f12477b;
        }
        if (axVar == null) {
            axVar = mo8047g();
        }
        if (nVar != null) {
            for (NavBackStackEntryState navBackStackEntryState : nVar) {
                C3825ax F = m10993F(axVar, navBackStackEntryState.f12264b);
                if (F != null) {
                    arrayList.add(navBackStackEntryState.mo8032a(this.f12287a, F, mo8041a(), this.f12298l));
                    axVar = F;
                } else {
                    throw new IllegalStateException("Restore State failed: destination " + C3823av.m11044b(this.f12287a, navBackStackEntryState.f12264b) + " cannot be found from the current destination " + axVar);
                }
            }
        }
        ArrayList<List> arrayList2 = new ArrayList<>();
        ArrayList<C3892m> arrayList3 = new ArrayList<>();
        for (Object next : arrayList) {
            if (!(((C3892m) next).f12477b instanceof C3834bb)) {
                arrayList3.add(next);
            }
        }
        for (C3892m mVar3 : arrayList3) {
            List list = (List) C69540x.m100824F(arrayList2);
            if (list == null || (mVar = (C3892m) C69540x.m100823E(list)) == null || (axVar2 = mVar.f12477b) == null) {
                str = null;
            } else {
                str = axVar2.f12354c;
            }
            if (C69664n.m101066l(str, mVar3.f12477b.f12354c)) {
                list.add(mVar3);
            } else {
                arrayList2.add(C69540x.m100949g(mVar3));
            }
        }
        C69644aa aaVar = new C69644aa();
        for (List list2 : arrayList2) {
            m10991D(this.f12303q.mo8077a(((C3892m) C69540x.m100819A(list2)).f12477b.f12354c), list2, bhVar, ceVar, new C3806ae(aaVar, arrayList, new C69646ac(), this, bundle));
        }
        return aaVar.f186023a;
    }

    /* renamed from: F */
    private static final C3825ax m10993F(C3825ax axVar, int i) {
        C3834bb bbVar;
        if (axVar.f12360i == i) {
            return axVar;
        }
        if (axVar instanceof C3834bb) {
            bbVar = (C3834bb) axVar;
        } else {
            bbVar = axVar.f12355d;
            C69664n.m101058d(bbVar);
        }
        return bbVar.mo8094h(i, true);
    }

    /* renamed from: A */
    public final void mo8040A() {
        Bundle bundle;
        int[] iArr;
        Bundle bundle2;
        Intent intent;
        if (m10989B() == 1) {
            Activity activity = this.f12308v;
            if (activity == null || (intent = activity.getIntent()) == null) {
                bundle = null;
            } else {
                bundle = intent.getExtras();
            }
            if (bundle == null) {
                iArr = null;
            } else {
                iArr = bundle.getIntArray("android-support-nav:controller:deepLinkIds");
            }
            if (iArr == null) {
                C3825ax f = mo8046f();
                C69664n.m101058d(f);
                int i = f.f12360i;
                for (C3834bb bbVar = f.f12355d; bbVar != null; bbVar = bbVar.f12355d) {
                    if (bbVar.f12375b != i) {
                        Bundle bundle3 = new Bundle();
                        Activity activity2 = this.f12308v;
                        if (!(activity2 == null || activity2.getIntent() == null)) {
                            Activity activity3 = this.f12308v;
                            C69664n.m101058d(activity3);
                            if (activity3.getIntent().getData() != null) {
                                Activity activity4 = this.f12308v;
                                C69664n.m101058d(activity4);
                                bundle3.putParcelable("android-support-nav:controller:deepLinkIntent", activity4.getIntent());
                                C3834bb bbVar2 = this.f12288b;
                                C69664n.m101058d(bbVar2);
                                Activity activity5 = this.f12308v;
                                C69664n.m101058d(activity5);
                                Intent intent2 = activity5.getIntent();
                                C69664n.m101060f(intent2, "activity!!.intent");
                                C3824aw e = bbVar2.mo8087e(new C3821at(intent2));
                                if (e != null) {
                                    bundle3.putAll(e.f12347a.mo8085c(e.f12348b));
                                }
                            }
                        }
                        C3820as asVar = new C3820as(this);
                        int i2 = bbVar.f12360i;
                        asVar.f12342d.clear();
                        asVar.f12342d.add(new C3817ap(i2, (Bundle) null));
                        if (asVar.f12341c != null) {
                            asVar.mo8079b();
                        }
                        asVar.mo8081d(bundle3);
                        asVar.mo8078a().mo5006c();
                        Activity activity6 = this.f12308v;
                        if (activity6 != null) {
                            activity6.finish();
                            return;
                        }
                        return;
                    }
                    i = bbVar.f12360i;
                }
            } else if (this.f12291e) {
                Activity activity7 = this.f12308v;
                C69664n.m101058d(activity7);
                Intent intent3 = activity7.getIntent();
                Bundle extras = intent3.getExtras();
                C69664n.m101058d(extras);
                int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                C69664n.m101058d(intArray);
                C69664n.m101060f(intArray, "extras!!.getIntArray(KEY_DEEP_LINK_IDS)!!");
                C69664n.m101061g(intArray, "<this>");
                ArrayList arrayList = new ArrayList(r7);
                int i3 = 0;
                for (int valueOf : intArray) {
                    arrayList.add(Integer.valueOf(valueOf));
                }
                ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                int intValue = ((Number) C69540x.m100810q(arrayList)).intValue();
                if (parcelableArrayList != null) {
                    Bundle bundle4 = (Bundle) C69540x.m100810q(parcelableArrayList);
                }
                if (!arrayList.isEmpty()) {
                    C3825ax F = m10993F(mo8047g(), intValue);
                    if (F instanceof C3834bb) {
                        intValue = C3827az.m11055a((C3834bb) F).f12360i;
                    }
                    C3825ax f2 = mo8046f();
                    if (f2 != null && intValue == f2.f12360i) {
                        C3820as asVar2 = new C3820as(this);
                        Bundle a = C1891d.m5154a(new C69685i("android-support-nav:controller:deepLinkIntent", intent3));
                        Bundle bundle5 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                        if (bundle5 != null) {
                            a.putAll(bundle5);
                        }
                        asVar2.mo8081d(a);
                        for (Object next : arrayList) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                C69540x.m100952j();
                            }
                            int intValue2 = ((Number) next).intValue();
                            if (parcelableArrayList == null) {
                                bundle2 = null;
                            } else {
                                bundle2 = (Bundle) parcelableArrayList.get(i3);
                            }
                            asVar2.mo8080c(intValue2, bundle2);
                            i3 = i4;
                        }
                        asVar2.mo8078a().mo5006c();
                        Activity activity8 = this.f12308v;
                        if (activity8 != null) {
                            activity8.finish();
                        }
                    }
                }
            }
        } else {
            mo8061u();
        }
    }

    /* renamed from: a */
    public final C2383n mo8041a() {
        return this.f12296j == null ? C2383n.CREATED : this.f12299m;
    }

    /* renamed from: b */
    public final C3892m mo8042b(int i) {
        Object obj;
        C69530n nVar = this.f12292f;
        ListIterator listIterator = nVar.listIterator(nVar.f185946a);
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((C3892m) obj).f12477b.f12360i == i) {
                break;
            }
        }
        C3892m mVar = (C3892m) obj;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalArgumentException("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + mo8046f());
    }

    /* renamed from: c */
    public final C3892m mo8043c() {
        return (C3892m) this.f12292f.mo61314f();
    }

    /* renamed from: d */
    public final C3892m mo8044d() {
        Object obj;
        Iterator it = C69540x.m100834P(this.f12292f).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator a = C69734n.m101176b(it).mo5191a();
        while (true) {
            if (!a.hasNext()) {
                obj = null;
                break;
            }
            obj = a.next();
            if (!(((C3892m) obj).f12477b instanceof C3834bb)) {
                break;
            }
        }
        return (C3892m) obj;
    }

    /* renamed from: e */
    public final C3825ax mo8045e(int i) {
        C3834bb bbVar = this.f12288b;
        C3825ax axVar = null;
        if (bbVar == null) {
            return null;
        }
        if (bbVar.f12360i == i) {
            return bbVar;
        }
        C3892m mVar = (C3892m) this.f12292f.mo61314f();
        if (mVar != null) {
            axVar = mVar.f12477b;
        }
        if (axVar == null) {
            axVar = this.f12288b;
            C69664n.m101058d(axVar);
        }
        return m10993F(axVar, i);
    }

    /* renamed from: f */
    public final C3825ax mo8046f() {
        C3892m c = mo8043c();
        if (c == null) {
            return null;
        }
        return c.f12477b;
    }

    /* renamed from: g */
    public final C3834bb mo8047g() {
        C3834bb bbVar = this.f12288b;
        if (bbVar != null) {
            return bbVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    /* renamed from: h */
    public final C3838bf mo8048h() {
        return (C3838bf) this.f12285B.mo5768a();
    }

    /* renamed from: i */
    public final List mo8049i() {
        ArrayList arrayList = new ArrayList();
        for (C3895p pVar : this.f12304r.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : (Iterable) pVar.f12437g.mo62784e()) {
                C3892m mVar = (C3892m) next;
                if (!arrayList.contains(mVar) && !mVar.f12481f.f6612c.mo5788a(C2383n.STARTED)) {
                    arrayList2.add(next);
                }
            }
            C69540x.m100811r(arrayList, arrayList2);
        }
        C69530n nVar = this.f12292f;
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : nVar) {
            C3892m mVar2 = (C3892m) next2;
            if (!arrayList.contains(mVar2) && mVar2.f12481f.f6612c.mo5788a(C2383n.STARTED)) {
                arrayList3.add(next2);
            }
        }
        C69540x.m100811r(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object next3 : arrayList) {
            if (!(((C3892m) next3).f12477b instanceof C3834bb)) {
                arrayList4.add(next3);
            }
        }
        return arrayList4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: androidx.navigation.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: androidx.navigation.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: androidx.navigation.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: androidx.navigation.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8050j(androidx.navigation.C3825ax r9, android.os.Bundle r10, androidx.navigation.C3892m r11, java.util.List r12) {
        /*
            r8 = this;
            androidx.navigation.ax r0 = r11.f12477b
            boolean r1 = r0 instanceof androidx.navigation.fragment.C3878b
            if (r1 != 0) goto L_0x002c
        L_0x0006:
            h.a.n r1 = r8.f12292f
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x002c
            java.lang.Object r1 = r1.mo61313e()
            androidx.navigation.m r1 = (androidx.navigation.C3892m) r1
            androidx.navigation.ax r1 = r1.f12477b
            boolean r1 = r1 instanceof androidx.navigation.fragment.C3878b
            if (r1 == 0) goto L_0x002c
            h.a.n r1 = r8.f12292f
            java.lang.Object r1 = r1.mo61313e()
            androidx.navigation.m r1 = (androidx.navigation.C3892m) r1
            androidx.navigation.ax r1 = r1.f12477b
            int r1 = r1.f12360i
            boolean r1 = r8.mo8063w(r1, true, false)
            if (r1 != 0) goto L_0x0006
        L_0x002c:
            h.a.n r1 = new h.a.n
            r1.<init>()
            boolean r2 = r9 instanceof androidx.navigation.C3834bb
            r3 = 0
            if (r2 == 0) goto L_0x0091
            r2 = r0
        L_0x0037:
            p5462h.p5473f.p5475b.C69664n.m101058d(r2)
            androidx.navigation.bb r2 = r2.f12355d
            if (r2 == 0) goto L_0x008d
            int r4 = r12.size()
            java.util.ListIterator r4 = r12.listIterator(r4)
        L_0x0046:
            boolean r5 = r4.hasPrevious()
            if (r5 == 0) goto L_0x005c
            java.lang.Object r5 = r4.previous()
            r6 = r5
            androidx.navigation.m r6 = (androidx.navigation.C3892m) r6
            androidx.navigation.ax r6 = r6.f12477b
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r6, r2)
            if (r6 == 0) goto L_0x0046
            goto L_0x005d
        L_0x005c:
            r5 = r3
        L_0x005d:
            androidx.navigation.m r5 = (androidx.navigation.C3892m) r5
            if (r5 != 0) goto L_0x006d
            android.content.Context r4 = r8.f12287a
            androidx.lifecycle.n r5 = r8.mo8041a()
            androidx.navigation.ai r6 = r8.f12298l
            androidx.navigation.m r5 = androidx.navigation.C3887h.m11190b(r4, r2, r10, r5, r6)
        L_0x006d:
            r1.mo61318i(r5)
            h.a.n r4 = r8.f12292f
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x008d
            java.lang.Object r4 = r4.mo61313e()
            androidx.navigation.m r4 = (androidx.navigation.C3892m) r4
            androidx.navigation.ax r4 = r4.f12477b
            if (r4 != r2) goto L_0x008d
            h.a.n r4 = r8.f12292f
            java.lang.Object r4 = r4.mo61313e()
            androidx.navigation.m r4 = (androidx.navigation.C3892m) r4
            r8.mo8053m(r4, false, new p5462h.p5463a.C69530n())
        L_0x008d:
            if (r2 == 0) goto L_0x0091
            if (r2 != r9) goto L_0x0037
        L_0x0091:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0099
            r2 = r0
            goto L_0x00a1
        L_0x0099:
            java.lang.Object r2 = r1.mo61309c()
            androidx.navigation.m r2 = (androidx.navigation.C3892m) r2
            androidx.navigation.ax r2 = r2.f12477b
        L_0x00a1:
            if (r2 == 0) goto L_0x00e6
            int r4 = r2.f12360i
            androidx.navigation.ax r4 = r8.mo8045e(r4)
            if (r4 != 0) goto L_0x00e6
            androidx.navigation.bb r2 = r2.f12355d
            if (r2 == 0) goto L_0x00a1
            int r4 = r12.size()
            java.util.ListIterator r4 = r12.listIterator(r4)
        L_0x00b7:
            boolean r5 = r4.hasPrevious()
            if (r5 == 0) goto L_0x00cd
            java.lang.Object r5 = r4.previous()
            r6 = r5
            androidx.navigation.m r6 = (androidx.navigation.C3892m) r6
            androidx.navigation.ax r6 = r6.f12477b
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r6, r2)
            if (r6 == 0) goto L_0x00b7
            goto L_0x00ce
        L_0x00cd:
            r5 = r3
        L_0x00ce:
            androidx.navigation.m r5 = (androidx.navigation.C3892m) r5
            if (r5 != 0) goto L_0x00e2
            android.content.Context r4 = r8.f12287a
            android.os.Bundle r5 = r2.mo8085c(r10)
            androidx.lifecycle.n r6 = r8.mo8041a()
            androidx.navigation.ai r7 = r8.f12298l
            androidx.navigation.m r5 = androidx.navigation.C3887h.m11190b(r4, r2, r5, r6, r7)
        L_0x00e2:
            r1.mo61318i(r5)
            goto L_0x00a1
        L_0x00e6:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x00ed
            goto L_0x00f5
        L_0x00ed:
            java.lang.Object r0 = r1.mo61313e()
            androidx.navigation.m r0 = (androidx.navigation.C3892m) r0
            androidx.navigation.ax r0 = r0.f12477b
        L_0x00f5:
            h.a.n r2 = r8.f12292f
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x012a
            java.lang.Object r2 = r2.mo61313e()
            androidx.navigation.m r2 = (androidx.navigation.C3892m) r2
            androidx.navigation.ax r2 = r2.f12477b
            boolean r2 = r2 instanceof androidx.navigation.C3834bb
            if (r2 == 0) goto L_0x012a
            h.a.n r2 = r8.f12292f
            java.lang.Object r2 = r2.mo61313e()
            androidx.navigation.m r2 = (androidx.navigation.C3892m) r2
            androidx.navigation.ax r2 = r2.f12477b
            androidx.navigation.bb r2 = (androidx.navigation.C3834bb) r2
            int r4 = r0.f12360i
            r5 = 0
            androidx.navigation.ax r2 = r2.mo8094h(r4, r5)
            if (r2 != 0) goto L_0x012a
            h.a.n r2 = r8.f12292f
            java.lang.Object r2 = r2.mo61313e()
            androidx.navigation.m r2 = (androidx.navigation.C3892m) r2
            r8.mo8053m(r2, false, new p5462h.p5463a.C69530n())
            goto L_0x00f5
        L_0x012a:
            h.a.n r0 = r8.f12292f
            java.lang.Object r0 = r0.mo61312d()
            androidx.navigation.m r0 = (androidx.navigation.C3892m) r0
            if (r0 != 0) goto L_0x013a
            java.lang.Object r0 = r1.mo61312d()
            androidx.navigation.m r0 = (androidx.navigation.C3892m) r0
        L_0x013a:
            if (r0 != 0) goto L_0x013e
            r0 = r3
            goto L_0x0140
        L_0x013e:
            androidx.navigation.ax r0 = r0.f12477b
        L_0x0140:
            androidx.navigation.bb r2 = r8.f12288b
            boolean r0 = p5462h.p5473f.p5475b.C69664n.m101066l(r0, r2)
            if (r0 != 0) goto L_0x018c
            int r0 = r12.size()
            java.util.ListIterator r12 = r12.listIterator(r0)
        L_0x0150:
            boolean r0 = r12.hasPrevious()
            if (r0 == 0) goto L_0x016b
            java.lang.Object r0 = r12.previous()
            r2 = r0
            androidx.navigation.m r2 = (androidx.navigation.C3892m) r2
            androidx.navigation.ax r2 = r2.f12477b
            androidx.navigation.bb r4 = r8.f12288b
            p5462h.p5473f.p5475b.C69664n.m101058d(r4)
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r2, r4)
            if (r2 == 0) goto L_0x0150
            r3 = r0
        L_0x016b:
            androidx.navigation.m r3 = (androidx.navigation.C3892m) r3
            if (r3 != 0) goto L_0x0189
            android.content.Context r12 = r8.f12287a
            androidx.navigation.bb r0 = r8.f12288b
            p5462h.p5473f.p5475b.C69664n.m101058d(r0)
            androidx.navigation.bb r2 = r8.f12288b
            p5462h.p5473f.p5475b.C69664n.m101058d(r2)
            android.os.Bundle r10 = r2.mo8085c(r10)
            androidx.lifecycle.n r2 = r8.mo8041a()
            androidx.navigation.ai r3 = r8.f12298l
            androidx.navigation.m r3 = androidx.navigation.C3887h.m11190b(r12, r0, r10, r2, r3)
        L_0x0189:
            r1.mo61318i(r3)
        L_0x018c:
            java.util.Iterator r10 = r1.iterator()
        L_0x0190:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x01cf
            java.lang.Object r12 = r10.next()
            androidx.navigation.m r12 = (androidx.navigation.C3892m) r12
            androidx.navigation.ck r0 = r8.f12303q
            androidx.navigation.ax r2 = r12.f12477b
            java.lang.String r2 = r2.f12354c
            androidx.navigation.ci r0 = r0.mo8077a(r2)
            java.util.Map r2 = r8.f12304r
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L_0x01b4
            androidx.navigation.p r0 = (androidx.navigation.C3895p) r0
            r0.mo8139c(r12)
            goto L_0x0190
        L_0x01b4:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "NavigatorBackStack for "
            r10.<init>(r11)
            java.lang.String r9 = r9.f12354c
            r10.append(r9)
            java.lang.String r9 = " should already be created"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r9)
            throw r10
        L_0x01cf:
            h.a.n r9 = r8.f12292f
            r9.addAll(r1)
            h.a.n r9 = r8.f12292f
            r9.mo61321j(r11)
            java.util.List r9 = p5462h.p5463a.C69540x.m100832N(r1, r11)
            java.util.Iterator r9 = r9.iterator()
        L_0x01e1:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01fd
            java.lang.Object r10 = r9.next()
            androidx.navigation.m r10 = (androidx.navigation.C3892m) r10
            androidx.navigation.ax r11 = r10.f12477b
            androidx.navigation.bb r11 = r11.f12355d
            if (r11 == 0) goto L_0x01e1
            int r11 = r11.f12360i
            androidx.navigation.m r11 = r8.mo8042b(r11)
            r8.m10990C(r10, r11)
            goto L_0x01e1
        L_0x01fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C3807af.mo8050j(androidx.navigation.ax, android.os.Bundle, androidx.navigation.m, java.util.List):void");
    }

    /* renamed from: k */
    public final void mo8051k(C3896q qVar) {
        C69664n.m101061g(qVar, "listener");
        this.f12311y.add(qVar);
        C69530n nVar = this.f12292f;
        if (!nVar.isEmpty()) {
            C3892m mVar = (C3892m) nVar.mo61313e();
            qVar.mo8090a(this, mVar.f12477b, mVar.f12478c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        r1 = r3.f12392c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010b A[LOOP:1: B:39:0x0105->B:41:0x010b, LOOP_END] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8052l(androidx.navigation.C3825ax r14, android.os.Bundle r15, androidx.navigation.C3840bh r16, androidx.navigation.C3864ce r17) {
        /*
            r13 = this;
            r6 = r13
            r0 = r14
            r3 = r16
            java.util.Map r1 = r6.f12304r
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r2 = r1.hasNext()
            r4 = 1
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r1.next()
            androidx.navigation.p r2 = (androidx.navigation.C3895p) r2
            r2.f12435e = r4
            goto L_0x000e
        L_0x001e:
            h.f.b.aa r7 = new h.f.b.aa
            r7.<init>()
            r8 = 0
            if (r3 == 0) goto L_0x0035
            int r1 = r3.f12392c
            r2 = -1
            if (r1 == r2) goto L_0x0035
            boolean r2 = r3.f12393d
            boolean r5 = r3.f12394e
            boolean r1 = r13.mo8063w(r1, r2, r5)
            r9 = r1
            goto L_0x0036
        L_0x0035:
            r9 = 0
        L_0x0036:
            android.os.Bundle r1 = r14.mo8085c(r15)
            if (r3 != 0) goto L_0x003f
        L_0x003c:
            r5 = r17
            goto L_0x005d
        L_0x003f:
            boolean r2 = r3.f12391b
            if (r2 != r4) goto L_0x003c
            java.util.Map r2 = r6.f12294h
            int r5 = r0.f12360i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L_0x003c
            int r0 = r0.f12360i
            r5 = r17
            boolean r0 = r13.m10992E(r0, r1, r3, r5)
            r7.f186023a = r0
            goto L_0x00f7
        L_0x005d:
            androidx.navigation.m r2 = r13.mo8043c()
            androidx.navigation.ck r10 = r6.f12303q
            java.lang.String r11 = r0.f12354c
            androidx.navigation.ci r10 = r10.mo8077a(r11)
            if (r3 != 0) goto L_0x006c
            goto L_0x00d8
        L_0x006c:
            boolean r11 = r3.f12390a
            if (r11 != r4) goto L_0x00d8
            int r11 = r0.f12360i
            if (r2 == 0) goto L_0x00d8
            androidx.navigation.ax r12 = r2.f12477b
            if (r12 == 0) goto L_0x00d8
            int r12 = r12.f12360i
            if (r11 != r12) goto L_0x00d8
            h.a.n r0 = r6.f12292f
            java.lang.Object r0 = r0.mo61317h()
            androidx.navigation.m r0 = (androidx.navigation.C3892m) r0
            r13.mo8064z(r0)
            androidx.navigation.m r0 = new androidx.navigation.m
            r0.<init>(r2, r1)
            h.a.n r1 = r6.f12292f
            r1.mo61321j(r0)
            androidx.navigation.ax r1 = r0.f12477b
            androidx.navigation.bb r1 = r1.f12355d
            if (r1 == 0) goto L_0x00a0
            int r1 = r1.f12360i
            androidx.navigation.m r1 = r13.mo8042b(r1)
            r13.m10990C(r0, r1)
        L_0x00a0:
            androidx.navigation.ax r1 = r0.f12477b
            boolean r2 = r1 instanceof androidx.navigation.C3825ax
            r3 = 0
            if (r4 == r2) goto L_0x00a8
            r1 = r3
        L_0x00a8:
            if (r1 != 0) goto L_0x00ab
            goto L_0x00f8
        L_0x00ab:
            androidx.navigation.ch r2 = androidx.navigation.C3867ch.f12427a
            androidx.navigation.bh r2 = androidx.navigation.C3842bj.m11073a(r2)
            r10.mo8075b(r1, r3, r2, r3)
            androidx.navigation.cl r1 = r10.mo8120f()
            kotlinx.coroutines.b.cy r2 = r1.f12433c
            java.lang.Object r3 = r2.mo62784e()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            kotlinx.coroutines.b.cy r1 = r1.f12433c
            java.lang.Object r1 = r1.mo62784e()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = p5462h.p5463a.C69540x.m100823E(r1)
            java.util.List r1 = p5462h.p5463a.C69540x.m100830L(r3, r1)
            java.util.List r0 = p5462h.p5463a.C69540x.m100832N(r1, r0)
            r2.mo62807f(r0)
            goto L_0x00f8
        L_0x00d8:
            android.content.Context r2 = r6.f12287a
            androidx.lifecycle.n r4 = r13.mo8041a()
            androidx.navigation.ai r11 = r6.f12298l
            androidx.navigation.m r2 = androidx.navigation.C3887h.m11190b(r2, r14, r1, r4, r11)
            java.util.List r2 = p5462h.p5463a.C69540x.m100944b(r2)
            androidx.navigation.w r11 = new androidx.navigation.w
            r11.<init>(r7, r13, r14, r1)
            r0 = r13
            r1 = r10
            r3 = r16
            r4 = r17
            r5 = r11
            r0.m10991D(r1, r2, r3, r4, r5)
        L_0x00f7:
            r4 = 0
        L_0x00f8:
            r13.mo8057q()
            java.util.Map r0 = r6.f12304r
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0105:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0114
            java.lang.Object r1 = r0.next()
            androidx.navigation.p r1 = (androidx.navigation.C3895p) r1
            r1.f12435e = r8
            goto L_0x0105
        L_0x0114:
            if (r9 != 0) goto L_0x0121
            boolean r0 = r7.f186023a
            if (r0 != 0) goto L_0x0121
            if (r4 == 0) goto L_0x011d
            goto L_0x0121
        L_0x011d:
            r13.mo8056p()
            return
        L_0x0121:
            r13.mo8059s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C3807af.mo8052l(androidx.navigation.ax, android.os.Bundle, androidx.navigation.bh, androidx.navigation.ce):void");
    }

    /* renamed from: m */
    public final void mo8053m(C3892m mVar, boolean z, C69530n nVar) {
        C3810ai aiVar;
        Set set;
        C3892m mVar2 = (C3892m) this.f12292f.mo61313e();
        if (C69664n.m101066l(mVar2, mVar)) {
            this.f12292f.mo61317h();
            C3895p pVar = (C3895p) this.f12304r.get(this.f12303q.mo8077a(mVar2.f12477b.f12354c));
            boolean z2 = true;
            if ((pVar == null || (set = (Set) pVar.f12437g.mo62784e()) == null || !set.contains(mVar2)) && !this.f12310x.containsKey(mVar2)) {
                z2 = false;
            }
            if (mVar2.f12481f.f6612c.mo5788a(C2383n.CREATED)) {
                if (z) {
                    mVar2.mo8133a(C2383n.CREATED);
                    nVar.mo61318i(new NavBackStackEntryState(mVar2));
                }
                if (!z2) {
                    mVar2.mo8133a(C2383n.DESTROYED);
                    mo8064z(mVar2);
                } else {
                    mVar2.mo8133a(C2383n.CREATED);
                }
            }
            if (!z && !z2 && (aiVar = this.f12298l) != null) {
                aiVar.mo8065a(mVar2.f12480e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Attempted to pop " + mVar.f12477b + ", which is not the top of the back stack (" + mVar2.f12477b + ')');
    }

    /* renamed from: n */
    public final void mo8054n(C3896q qVar) {
        C69664n.m101061g(qVar, "listener");
        this.f12311y.remove(qVar);
    }

    /* renamed from: o */
    public final void mo8055o(C3834bb bbVar, Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        C69664n.m101061g(bbVar, "graph");
        int i = 0;
        if (!C69664n.m101066l(this.f12288b, bbVar)) {
            C3834bb bbVar2 = this.f12288b;
            if (bbVar2 != null) {
                for (Integer num : new ArrayList(this.f12294h.keySet())) {
                    C69664n.m101060f(num, "id");
                    mo8058r(num.intValue());
                }
                boolean unused = mo8063w(bbVar2.f12360i, true, false);
            }
            this.f12288b = bbVar;
            Bundle bundle2 = this.f12289c;
            if (!(bundle2 == null || (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) == null)) {
                int size = stringArrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str = stringArrayList.get(i2);
                    C3870ck ckVar = this.f12303q;
                    C69664n.m101060f(str, "name");
                    C3868ci a = ckVar.mo8077a(str);
                    Bundle bundle3 = bundle2.getBundle(str);
                    if (bundle3 != null) {
                        a.mo8122h(bundle3);
                    }
                }
            }
            Parcelable[] parcelableArr = this.f12290d;
            if (parcelableArr != null) {
                int length = parcelableArr.length;
                while (i < length) {
                    int i3 = i + 1;
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelableArr[i];
                    C3825ax e = mo8045e(navBackStackEntryState.f12264b);
                    if (e != null) {
                        C3892m a2 = navBackStackEntryState.mo8032a(this.f12287a, e, mo8041a(), this.f12298l);
                        C3868ci a3 = this.f12303q.mo8077a(e.f12354c);
                        Map map = this.f12304r;
                        Object obj = map.get(a3);
                        if (obj == null) {
                            obj = new C3895p(this, a3);
                            map.put(a3, obj);
                        }
                        this.f12292f.mo61321j(a2);
                        ((C3895p) obj).mo8139c(a2);
                        C3834bb bbVar3 = a2.f12477b.f12355d;
                        if (bbVar3 != null) {
                            m10990C(a2, mo8042b(bbVar3.f12360i));
                        }
                        i = i3;
                    } else {
                        int i4 = C3825ax.f12352k;
                        String b = C3823av.m11044b(this.f12287a, navBackStackEntryState.f12264b);
                        throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + b + " cannot be found from the current destination " + mo8046f());
                    }
                }
                mo8057q();
                this.f12290d = null;
            }
            Collection values = C69505av.m100875q(this.f12303q.f12431b).values();
            ArrayList<C3868ci> arrayList = new ArrayList<>();
            for (Object next : values) {
                if (!((C3868ci) next).f12428a) {
                    arrayList.add(next);
                }
            }
            for (C3868ci ciVar : arrayList) {
                Map map2 = this.f12304r;
                Object obj2 = map2.get(ciVar);
                if (obj2 == null) {
                    obj2 = new C3895p(this, ciVar);
                    map2.put(ciVar, obj2);
                }
                ciVar.mo8121g((C3895p) obj2);
            }
            if (this.f12288b == null || !this.f12292f.isEmpty()) {
                mo8059s();
            } else if (this.f12291e || (activity = this.f12308v) == null || !mo8060t(activity.getIntent())) {
                C3834bb bbVar4 = this.f12288b;
                C69664n.m101058d(bbVar4);
                mo8052l(bbVar4, bundle, (C3840bh) null, (C3864ce) null);
            }
        } else {
            int d = bbVar.f12374a.mo3725d();
            while (i < d) {
                int i5 = i + 1;
                C3825ax axVar = (C3825ax) bbVar.f12374a.mo3727f(i);
                C3834bb bbVar5 = this.f12288b;
                C69664n.m101058d(bbVar5);
                C0985o oVar = bbVar5.f12374a;
                int a4 = oVar.mo3721a(i);
                if (a4 >= 0) {
                    Object[] objArr = oVar.f3126d;
                    Object obj3 = objArr[a4];
                    objArr[a4] = axVar;
                }
                C69530n nVar = this.f12292f;
                ArrayList<C3892m> arrayList2 = new ArrayList<>();
                for (Object next2 : nVar) {
                    int i6 = ((C3892m) next2).f12477b.f12360i;
                    if (axVar != null && i6 == axVar.f12360i) {
                        arrayList2.add(next2);
                    }
                }
                for (C3892m mVar : arrayList2) {
                    C69664n.m101060f(axVar, "newDestination");
                    C69664n.m101061g(axVar, "<set-?>");
                    mVar.f12477b = axVar;
                }
                i = i5;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e5  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8056p() {
        /*
            r11 = this;
            h.a.n r0 = r11.f12292f
            java.util.List r0 = p5462h.p5463a.C69540x.m100842X(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r1 = p5462h.p5463a.C69540x.m100823E(r0)
            androidx.navigation.m r1 = (androidx.navigation.C3892m) r1
            androidx.navigation.ax r1 = r1.f12477b
            boolean r2 = r1 instanceof androidx.navigation.fragment.C3878b
            r3 = 0
            if (r2 == 0) goto L_0x0039
            java.util.List r2 = p5462h.p5463a.C69540x.m100834P(r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x0022:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r2.next()
            androidx.navigation.m r4 = (androidx.navigation.C3892m) r4
            androidx.navigation.ax r4 = r4.f12477b
            boolean r5 = r4 instanceof androidx.navigation.C3834bb
            if (r5 != 0) goto L_0x0022
            boolean r5 = r4 instanceof androidx.navigation.fragment.C3878b
            if (r5 != 0) goto L_0x0022
            goto L_0x003a
        L_0x0039:
            r4 = r3
        L_0x003a:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.List r5 = p5462h.p5463a.C69540x.m100834P(r0)
            java.util.Iterator r5 = r5.iterator()
        L_0x0047:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00db
            java.lang.Object r6 = r5.next()
            androidx.navigation.m r6 = (androidx.navigation.C3892m) r6
            androidx.lifecycle.n r7 = r6.f12483h
            androidx.navigation.ax r8 = r6.f12477b
            if (r1 == 0) goto L_0x00b7
            int r9 = r8.f12360i
            int r10 = r1.f12360i
            if (r9 != r10) goto L_0x00b7
            androidx.lifecycle.n r8 = androidx.lifecycle.C2383n.RESUMED
            if (r7 == r8) goto L_0x00b4
            androidx.navigation.ck r7 = r11.f12303q
            androidx.navigation.ax r8 = r6.f12477b
            java.lang.String r8 = r8.f12354c
            androidx.navigation.ci r7 = r7.mo8077a(r8)
            java.util.Map r8 = r11.f12304r
            java.lang.Object r7 = r8.get(r7)
            androidx.navigation.p r7 = (androidx.navigation.C3895p) r7
            if (r7 != 0) goto L_0x0079
        L_0x0077:
            r7 = r3
            goto L_0x008c
        L_0x0079:
            kotlinx.coroutines.b.du r7 = r7.f12437g
            java.lang.Object r7 = r7.mo62784e()
            java.util.Set r7 = (java.util.Set) r7
            if (r7 != 0) goto L_0x0084
            goto L_0x0077
        L_0x0084:
            boolean r7 = r7.contains(r6)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L_0x008c:
            r8 = 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            boolean r7 = p5462h.p5473f.p5475b.C69664n.m101066l(r7, r8)
            if (r7 != 0) goto L_0x00af
            java.util.Map r7 = r11.f12310x
            java.lang.Object r7 = r7.get(r6)
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            if (r7 != 0) goto L_0x00a2
            goto L_0x00a9
        L_0x00a2:
            int r7 = r7.get()
            if (r7 != 0) goto L_0x00a9
            goto L_0x00af
        L_0x00a9:
            androidx.lifecycle.n r7 = androidx.lifecycle.C2383n.RESUMED
            r2.put(r6, r7)
            goto L_0x00b4
        L_0x00af:
            androidx.lifecycle.n r7 = androidx.lifecycle.C2383n.STARTED
            r2.put(r6, r7)
        L_0x00b4:
            androidx.navigation.bb r1 = r1.f12355d
            goto L_0x0047
        L_0x00b7:
            if (r4 == 0) goto L_0x00d4
            int r8 = r8.f12360i
            int r9 = r4.f12360i
            if (r8 != r9) goto L_0x00d4
            androidx.lifecycle.n r8 = androidx.lifecycle.C2383n.RESUMED
            if (r7 != r8) goto L_0x00c9
            androidx.lifecycle.n r7 = androidx.lifecycle.C2383n.STARTED
            r6.mo8133a(r7)
            goto L_0x00d0
        L_0x00c9:
            androidx.lifecycle.n r8 = androidx.lifecycle.C2383n.STARTED
            if (r7 == r8) goto L_0x00d0
            r2.put(r6, r8)
        L_0x00d0:
            androidx.navigation.bb r4 = r4.f12355d
            goto L_0x0047
        L_0x00d4:
            androidx.lifecycle.n r7 = androidx.lifecycle.C2383n.CREATED
            r6.mo8133a(r7)
            goto L_0x0047
        L_0x00db:
            java.util.Iterator r0 = r0.iterator()
        L_0x00df:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00fb
            java.lang.Object r1 = r0.next()
            androidx.navigation.m r1 = (androidx.navigation.C3892m) r1
            java.lang.Object r3 = r2.get(r1)
            androidx.lifecycle.n r3 = (androidx.lifecycle.C2383n) r3
            if (r3 == 0) goto L_0x00f7
            r1.mo8133a(r3)
            goto L_0x00df
        L_0x00f7:
            r1.mo8134b()
            goto L_0x00df
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C3807af.mo8056p():void");
    }

    /* renamed from: q */
    public final void mo8057q() {
        C0800m mVar = this.f12301o;
        boolean z = false;
        if (this.f12302p && m10989B() > 1) {
            z = true;
        }
        mVar.mo3352c(z);
    }

    /* renamed from: r */
    public final boolean mo8058r(int i) {
        for (C3895p pVar : this.f12304r.values()) {
            pVar.f12435e = true;
        }
        boolean E = m10992E(i, (Bundle) null, (C3840bh) null, (C3864ce) null);
        for (C3895p pVar2 : this.f12304r.values()) {
            pVar2.f12435e = false;
        }
        if (!E || !mo8063w(i, true, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final boolean mo8059s() {
        while (true) {
            C69530n nVar = this.f12292f;
            if (nVar.isEmpty() || !(((C3892m) nVar.mo61313e()).f12477b instanceof C3834bb)) {
                C3892m mVar = (C3892m) this.f12292f.mo61314f();
            } else {
                mo8053m((C3892m) this.f12292f.mo61313e(), false, new C69530n());
            }
        }
        C3892m mVar2 = (C3892m) this.f12292f.mo61314f();
        if (mVar2 != null) {
            this.f12284A.add(mVar2);
        }
        this.f12312z++;
        mo8056p();
        int i = this.f12312z - 1;
        this.f12312z = i;
        if (i == 0) {
            List<C3892m> X = C69540x.m100842X(this.f12284A);
            this.f12284A.clear();
            for (C3892m mVar3 : X) {
                Iterator it = this.f12311y.iterator();
                while (it.hasNext()) {
                    ((C3896q) it.next()).mo8090a(this, mVar3.f12477b, mVar3.f12478c);
                }
                this.f12286C.mo62806d(mVar3);
            }
            ((C71573dw) this.f12293g).mo62807f(mo8049i());
        }
        if (mVar2 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean mo8060t(Intent intent) {
        int[] iArr;
        ArrayList arrayList;
        Bundle bundle;
        int length;
        String str;
        C3825ax axVar;
        Bundle bundle2;
        Object obj;
        int i = 0;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            iArr = null;
        } else {
            iArr = extras.getIntArray("android-support-nav:controller:deepLinkIds");
        }
        if (extras == null) {
            arrayList = null;
        } else {
            arrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        }
        Bundle bundle3 = new Bundle();
        if (extras == null) {
            bundle = null;
        } else {
            bundle = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        }
        if (bundle != null) {
            bundle3.putAll(bundle);
        }
        if (iArr == null || iArr.length == 0) {
            C3834bb bbVar = this.f12288b;
            C69664n.m101058d(bbVar);
            C3824aw e = bbVar.mo8087e(new C3821at(intent));
            if (e != null) {
                C3825ax axVar2 = e.f12347a;
                int[] g = axVar2.mo8089g((C3825ax) null);
                Bundle c = axVar2.mo8085c(e.f12348b);
                if (c != null) {
                    bundle3.putAll(c);
                }
                iArr = g;
                arrayList = null;
            }
        }
        if (iArr == null || (length = iArr.length) == 0) {
            return false;
        }
        C3834bb bbVar2 = this.f12288b;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                str = null;
                break;
            }
            int i3 = i2 + 1;
            int i4 = iArr[i2];
            if (i2 == 0) {
                C3834bb bbVar3 = this.f12288b;
                C69664n.m101058d(bbVar3);
                obj = bbVar3.f12360i == i4 ? this.f12288b : null;
            } else {
                C69664n.m101058d(bbVar2);
                obj = bbVar2.mo8094h(i4, true);
            }
            if (obj == null) {
                str = C3823av.m11044b(this.f12287a, i4);
                break;
            }
            if (i2 != iArr.length - 1 && (obj instanceof C3834bb)) {
                bbVar2 = (C3834bb) obj;
                while (true) {
                    C69664n.m101058d(bbVar2);
                    if (!(bbVar2.mo8094h(bbVar2.f12375b, true) instanceof C3834bb)) {
                        break;
                    }
                    bbVar2 = (C3834bb) bbVar2.mo8094h(bbVar2.f12375b, true);
                }
            }
            i2 = i3;
        }
        if (str != null) {
            Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle3.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int length2 = iArr.length;
        Bundle[] bundleArr = new Bundle[length2];
        int i5 = 0;
        while (i5 < length2) {
            int i6 = i5 + 1;
            Bundle bundle4 = new Bundle();
            bundle4.putAll(bundle3);
            if (!(arrayList == null || (bundle2 = (Bundle) arrayList.get(i5)) == null)) {
                bundle4.putAll(bundle2);
            }
            bundleArr[i5] = bundle4;
            i5 = i6;
        }
        int flags = intent.getFlags();
        if ((268435456 & flags) == 0) {
            C3834bb bbVar4 = this.f12288b;
            int length3 = iArr.length;
            int i7 = 0;
            while (i7 < length3) {
                int i8 = i7 + 1;
                int i9 = iArr[i7];
                Bundle bundle5 = bundleArr[i7];
                if (i7 == 0) {
                    axVar = this.f12288b;
                } else {
                    C69664n.m101058d(bbVar4);
                    axVar = bbVar4.mo8094h(i9, true);
                }
                if (axVar != null) {
                    if (i7 == iArr.length - 1) {
                        C3839bg bgVar = new C3839bg();
                        C3834bb bbVar5 = this.f12288b;
                        C69664n.m101058d(bbVar5);
                        bgVar.mo8100b(bbVar5.f12360i, true, false);
                        bgVar.f12383c = 0;
                        bgVar.f12384d = 0;
                        mo8052l(axVar, bundle5, bgVar.mo8099a(), (C3864ce) null);
                    } else if (axVar instanceof C3834bb) {
                        bbVar4 = (C3834bb) axVar;
                        while (true) {
                            C69664n.m101058d(bbVar4);
                            if (!(bbVar4.mo8094h(bbVar4.f12375b, true) instanceof C3834bb)) {
                                break;
                            }
                            bbVar4 = (C3834bb) bbVar4.mo8094h(bbVar4.f12375b, true);
                        }
                    }
                    i7 = i8;
                } else {
                    int i10 = C3825ax.f12352k;
                    throw new IllegalStateException("Deep Linking failed: destination " + C3823av.m11044b(this.f12287a, i9) + " cannot be found in graph " + bbVar4);
                }
            }
            this.f12291e = true;
            return true;
        } else if ((flags & 32768) == 0) {
            intent.addFlags(32768);
            C1815be beVar = new C1815be(this.f12287a);
            beVar.mo5004a(intent);
            beVar.mo5006c();
            Activity activity = this.f12308v;
            if (activity != null) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
            return true;
        } else {
            if (!this.f12292f.isEmpty()) {
                C3834bb bbVar6 = this.f12288b;
                C69664n.m101058d(bbVar6);
                boolean unused = mo8063w(bbVar6.f12360i, true, false);
            }
            while (i < iArr.length) {
                int i11 = iArr[i];
                int i12 = i + 1;
                Bundle bundle6 = bundleArr[i];
                C3825ax e2 = mo8045e(i11);
                if (e2 != null) {
                    mo8052l(e2, bundle6, C3842bj.m11073a(new C3900u(e2, this)), (C3864ce) null);
                    i = i12;
                } else {
                    int i13 = C3825ax.f12352k;
                    throw new IllegalStateException("Deep Linking failed: destination " + C3823av.m11044b(this.f12287a, i11) + " cannot be found from the current destination " + mo8046f());
                }
            }
            return true;
        }
    }

    /* renamed from: u */
    public final boolean mo8061u() {
        if (this.f12292f.isEmpty()) {
            return false;
        }
        C3825ax f = mo8046f();
        C69664n.m101058d(f);
        return mo8062v(f.f12360i, true, false);
    }

    /* renamed from: v */
    public final boolean mo8062v(int i, boolean z, boolean z2) {
        return mo8063w(i, z, z2) && mo8059s();
    }

    /* renamed from: w */
    public final boolean mo8063w(int i, boolean z, boolean z2) {
        C3825ax axVar;
        String str;
        int i2 = i;
        boolean z3 = z2;
        if (this.f12292f.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = C69540x.m100834P(this.f12292f).iterator();
        while (true) {
            if (!it.hasNext()) {
                axVar = null;
                break;
            }
            C3825ax axVar2 = ((C3892m) it.next()).f12477b;
            C3868ci a = this.f12303q.mo8077a(axVar2.f12354c);
            if (z || axVar2.f12360i != i2) {
                arrayList.add(a);
            }
            if (axVar2.f12360i == i2) {
                axVar = axVar2;
                break;
            }
        }
        if (axVar == null) {
            int i3 = C3825ax.f12352k;
            String b = C3823av.m11044b(this.f12287a, i2);
            Log.i("NavController", "Ignoring popBackStack to destination " + b + " as it was not found on the current back stack");
            return false;
        }
        C69644aa aaVar = new C69644aa();
        C69530n nVar = new C69530n();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                str = null;
                break;
            }
            C69644aa aaVar2 = new C69644aa();
            C3904y yVar = r0;
            C3904y yVar2 = new C3904y(aaVar2, aaVar, this, z2, nVar);
            this.f12306t = yVar;
            ((C3868ci) it2.next()).mo8123i((C3892m) this.f12292f.mo61313e(), z3);
            str = null;
            this.f12306t = null;
            if (!aaVar2.f186023a) {
                break;
            }
        }
        if (z3) {
            if (!z) {
                Iterator a2 = C69734n.m101145m(C69734n.m101178d(axVar, C3905z.f12508a), new C3802aa(this)).mo5191a();
                while (a2.hasNext()) {
                    Map map = this.f12294h;
                    Integer valueOf = Integer.valueOf(((C3825ax) a2.next()).f12360i);
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) nVar.mo61312d();
                    map.put(valueOf, navBackStackEntryState == null ? str : navBackStackEntryState.f12263a);
                }
            }
            if (!nVar.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) nVar.mo61309c();
                Iterator a3 = C69734n.m101145m(C69734n.m101178d(mo8045e(navBackStackEntryState2.f12264b), C3803ab.f12276a), new C3804ac(this)).mo5191a();
                while (a3.hasNext()) {
                    this.f12294h.put(Integer.valueOf(((C3825ax) a3.next()).f12360i), navBackStackEntryState2.f12263a);
                }
                this.f12295i.put(navBackStackEntryState2.f12263a, nVar);
            }
        }
        mo8057q();
        return aaVar.f186023a;
    }

    /* renamed from: z */
    public final void mo8064z(C3892m mVar) {
        C3810ai aiVar;
        C69664n.m101061g(mVar, "child");
        C3892m mVar2 = (C3892m) this.f12309w.remove(mVar);
        if (mVar2 != null) {
            AtomicInteger atomicInteger = (AtomicInteger) this.f12310x.get(mVar2);
            Integer valueOf = atomicInteger == null ? null : Integer.valueOf(atomicInteger.decrementAndGet());
            if (valueOf != null && valueOf.intValue() == 0) {
                C3895p pVar = (C3895p) this.f12304r.get(this.f12303q.mo8077a(mVar2.f12477b.f12354c));
                if (pVar != null) {
                    boolean l = C69664n.m101066l(pVar.f12490a.f12307u.get(mVar2), true);
                    C71548cy cyVar = pVar.f12434d;
                    cyVar.mo62807f(C69514bd.m100890d((Set) cyVar.mo62784e(), mVar2));
                    pVar.f12490a.f12307u.remove(mVar2);
                    if (!pVar.f12490a.f12292f.contains(mVar2)) {
                        pVar.f12490a.mo8064z(mVar2);
                        if (mVar2.f12481f.f6612c.mo5788a(C2383n.CREATED)) {
                            mVar2.mo8133a(C2383n.DESTROYED);
                        }
                        C69530n nVar = pVar.f12490a.f12292f;
                        if (!nVar.isEmpty()) {
                            Iterator it = nVar.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (C69664n.m101066l(((C3892m) it.next()).f12480e, mVar2.f12480e)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (!l && (aiVar = pVar.f12490a.f12298l) != null) {
                            aiVar.mo8065a(mVar2.f12480e);
                        }
                        pVar.f12490a.mo8056p();
                        C3807af afVar = pVar.f12490a;
                        ((C71573dw) afVar.f12293g).mo62807f(afVar.mo8049i());
                    } else if (!pVar.f12435e) {
                        pVar.f12490a.mo8056p();
                        C3807af afVar2 = pVar.f12490a;
                        ((C71573dw) afVar2.f12293g).mo62807f(afVar2.mo8049i());
                    }
                }
                this.f12310x.remove(mVar2);
            }
        }
    }
}
