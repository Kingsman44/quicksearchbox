package android.support.p031v4.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p031v4.app.Fragment;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C0800m;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.C0816c;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2389t;
import androidx.lifecycle.C2391v;
import androidx.p116i.p117a.p118a.C2284e;
import com.google.android.googlequicksearchbox.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.DesugarCollections;

/* renamed from: android.support.v4.app.FragmentManager */
/* compiled from: PG */
public class FragmentManager {

    /* renamed from: A */
    public C0202bu f623A;

    /* renamed from: B */
    private final ArrayList f624B = new ArrayList();

    /* renamed from: C */
    private boolean f625C;

    /* renamed from: D */
    private ArrayList f626D;

    /* renamed from: E */
    private final C0173as f627E = new C0182ba(this);

    /* renamed from: F */
    private boolean f628F;

    /* renamed from: G */
    private ArrayList f629G;

    /* renamed from: H */
    private ArrayList f630H;

    /* renamed from: I */
    private ArrayList f631I;

    /* renamed from: J */
    private final Runnable f632J = new C0184bc(this);

    /* renamed from: K */
    private final C0183bb f633K = new C0183bb();

    /* renamed from: a */
    public final C0211cc f634a = new C0211cc();

    /* renamed from: b */
    ArrayList f635b;

    /* renamed from: c */
    public final C0176av f636c = new C0176av(this);

    /* renamed from: d */
    public OnBackPressedDispatcher f637d;

    /* renamed from: e */
    public final C0800m f638e = new C0180az(this);

    /* renamed from: f */
    public final AtomicInteger f639f = new AtomicInteger();

    /* renamed from: g */
    public final Map f640g = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: h */
    public final Map f641h = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: i */
    public final Map f642i = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: j */
    public ArrayList f643j;

    /* renamed from: k */
    public final C0178ax f644k = new C0178ax(this);

    /* renamed from: l */
    public final CopyOnWriteArrayList f645l = new CopyOnWriteArrayList();

    /* renamed from: m */
    int f646m = -1;

    /* renamed from: n */
    public C0174at f647n;

    /* renamed from: o */
    public C0171aq f648o;

    /* renamed from: p */
    public Fragment f649p;

    /* renamed from: q */
    public Fragment f650q;

    /* renamed from: r */
    public C0173as f651r = null;

    /* renamed from: s */
    public C0816c f652s;

    /* renamed from: t */
    public C0816c f653t;

    /* renamed from: u */
    public C0816c f654u;

    /* renamed from: v */
    ArrayDeque f655v = new ArrayDeque();

    /* renamed from: w */
    public boolean f656w;

    /* renamed from: x */
    public boolean f657x;

    /* renamed from: y */
    public boolean f658y;

    /* renamed from: z */
    public boolean f659z;

    /* renamed from: android.support.v4.app.FragmentManager$LaunchedFragmentInfo */
    /* compiled from: PG */
    class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0193bl();

        /* renamed from: a */
        String f664a;

        /* renamed from: b */
        int f665b;

        public LaunchedFragmentInfo(Parcel parcel) {
            this.f664a = parcel.readString();
            this.f665b = parcel.readInt();
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.f664a = str;
            this.f665b = i;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f664a);
            parcel.writeInt(this.f665b);
        }
    }

    /* renamed from: Z */
    public static boolean m246Z(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: ai */
    public static final boolean m247ai(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        boolean z = false;
        for (Fragment fragment2 : fragment.mChildFragmentManager.f634a.mo676h()) {
            if (fragment2 != null) {
                z = m247ai(fragment2);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: aj */
    static final boolean m248aj(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* renamed from: am */
    static final void m249am(Fragment fragment) {
        if (m246Z(2)) {
            new StringBuilder("show: ").append(fragment);
            Log.v("FragmentManager", "show: ".concat(String.valueOf(fragment)));
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* renamed from: ao */
    private final ViewGroup m250ao(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f648o.mo522b()) {
            View a = this.f648o.mo521a(fragment.mContainerId);
            if (a instanceof ViewGroup) {
                return (ViewGroup) a;
            }
        }
        return null;
    }

    /* renamed from: ap */
    private final Set m251ap() {
        HashSet hashSet = new HashSet();
        for (C0209ca caVar : this.f634a.mo675g()) {
            ViewGroup viewGroup = caVar.f785a.mContainer;
            if (viewGroup != null) {
                mo466ag();
                hashSet.add(C0239dd.m562k(viewGroup));
            }
        }
        return hashSet;
    }

    /* renamed from: aq */
    private final void m252aq() {
        if (mo461ab()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: ar */
    private final void m253ar() {
        this.f625C = false;
        this.f630H.clear();
        this.f629G.clear();
    }

    /* renamed from: as */
    private final void m254as() {
        if (this.f628F) {
            this.f628F = false;
            m261az();
        }
    }

    /* renamed from: at */
    private final void m255at() {
        for (C0239dd h : m251ap()) {
            h.mo749h();
        }
    }

    /* renamed from: au */
    private final void m256au(boolean z) {
        if (this.f625C) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f647n == null) {
            if (this.f659z) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f647n.f743d.getLooper()) {
            if (!z) {
                m252aq();
            }
            if (this.f629G == null) {
                this.f629G = new ArrayList();
                this.f630H = new ArrayList();
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: android.support.v4.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: av */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m257av(java.util.ArrayList r20, java.util.ArrayList r21, int r22, int r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            java.lang.Object r5 = r1.get(r3)
            android.support.v4.app.a r5 = (android.support.p031v4.app.C0154a) r5
            boolean r5 = r5.f824t
            java.util.ArrayList r6 = r0.f631I
            if (r6 != 0) goto L_0x001e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.f631I = r6
            goto L_0x0021
        L_0x001e:
            r6.clear()
        L_0x0021:
            java.util.ArrayList r6 = r0.f631I
            android.support.v4.app.cc r7 = r0.f634a
            java.util.List r7 = r7.mo677i()
            r6.addAll(r7)
            android.support.v4.app.Fragment r6 = r0.f650q
            r8 = r3
            r9 = 0
        L_0x0030:
            r12 = 1
            if (r8 >= r4) goto L_0x017e
            java.lang.Object r13 = r1.get(r8)
            android.support.v4.app.a r13 = (android.support.p031v4.app.C0154a) r13
            java.lang.Object r14 = r2.get(r8)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            r15 = 3
            if (r14 != 0) goto L_0x0130
            java.util.ArrayList r14 = r0.f631I
            r7 = 0
        L_0x0049:
            java.util.ArrayList r11 = r13.f809e
            int r11 = r11.size()
            if (r7 >= r11) goto L_0x016a
            java.util.ArrayList r11 = r13.f809e
            java.lang.Object r11 = r11.get(r7)
            android.support.v4.app.cd r11 = (android.support.p031v4.app.C0212cd) r11
            int r10 = r11.f800a
            if (r10 == r12) goto L_0x0085
            r12 = 2
            r3 = 9
            if (r10 == r12) goto L_0x00a1
            if (r10 == r15) goto L_0x0088
            r12 = 6
            if (r10 == r12) goto L_0x0088
            r12 = 7
            if (r10 == r12) goto L_0x0085
            r12 = 8
            if (r10 == r12) goto L_0x006f
            goto L_0x0082
        L_0x006f:
            java.util.ArrayList r10 = r13.f809e
            android.support.v4.app.cd r12 = new android.support.v4.app.cd
            r15 = 0
            r12.<init>(r3, r6, r15)
            r10.add(r7, r12)
            r3 = 1
            r11.f802c = r3
            int r7 = r7 + 1
            android.support.v4.app.Fragment r3 = r11.f801b
            r6 = r3
        L_0x0082:
            r1 = 1
            goto L_0x0125
        L_0x0085:
            r1 = 1
            goto L_0x0120
        L_0x0088:
            android.support.v4.app.Fragment r10 = r11.f801b
            r14.remove(r10)
            android.support.v4.app.Fragment r10 = r11.f801b
            if (r10 != r6) goto L_0x0082
            java.util.ArrayList r6 = r13.f809e
            android.support.v4.app.cd r11 = new android.support.v4.app.cd
            r11.<init>((int) r3, (android.support.p031v4.app.Fragment) r10)
            r6.add(r7, r11)
            int r7 = r7 + 1
            r1 = 1
            r6 = 0
            goto L_0x0125
        L_0x00a1:
            android.support.v4.app.Fragment r10 = r11.f801b
            int r12 = r10.mContainerId
            int r15 = r14.size()
            r16 = -1
            int r15 = r15 + -1
            r17 = 0
        L_0x00af:
            if (r15 < 0) goto L_0x010c
            java.lang.Object r18 = r14.get(r15)
            r3 = r18
            android.support.v4.app.Fragment r3 = (android.support.p031v4.app.Fragment) r3
            int r2 = r3.mContainerId
            if (r2 != r12) goto L_0x00ff
            if (r3 != r10) goto L_0x00c4
            r18 = r12
            r17 = 1
            goto L_0x0101
        L_0x00c4:
            if (r3 != r6) goto L_0x00d9
            java.util.ArrayList r2 = r13.f809e
            android.support.v4.app.cd r6 = new android.support.v4.app.cd
            r18 = r12
            r1 = 9
            r12 = 0
            r6.<init>(r1, r3, r12)
            r2.add(r7, r6)
            int r7 = r7 + 1
            r6 = r12
            goto L_0x00de
        L_0x00d9:
            r18 = r12
            r1 = 9
            r12 = 0
        L_0x00de:
            android.support.v4.app.cd r2 = new android.support.v4.app.cd
            r1 = 3
            r2.<init>(r1, r3, r12)
            int r1 = r11.f803d
            r2.f803d = r1
            int r1 = r11.f805f
            r2.f805f = r1
            int r1 = r11.f804e
            r2.f804e = r1
            int r1 = r11.f806g
            r2.f806g = r1
            java.util.ArrayList r1 = r13.f809e
            r1.add(r7, r2)
            r14.remove(r3)
            r1 = 1
            int r7 = r7 + r1
            goto L_0x0101
        L_0x00ff:
            r18 = r12
        L_0x0101:
            int r15 = r15 + -1
            r1 = r20
            r2 = r21
            r12 = r18
            r3 = 9
            goto L_0x00af
        L_0x010c:
            if (r17 == 0) goto L_0x0117
            java.util.ArrayList r1 = r13.f809e
            r1.remove(r7)
            int r7 = r7 + -1
            goto L_0x0082
        L_0x0117:
            r1 = 1
            r11.f800a = r1
            r11.f802c = r1
            r14.add(r10)
            goto L_0x0125
        L_0x0120:
            android.support.v4.app.Fragment r2 = r11.f801b
            r14.add(r2)
        L_0x0125:
            int r7 = r7 + r1
            r1 = r20
            r2 = r21
            r3 = r22
            r12 = 1
            r15 = 3
            goto L_0x0049
        L_0x0130:
            java.util.ArrayList r1 = r0.f631I
            java.util.ArrayList r2 = r13.f809e
            int r2 = r2.size()
            r3 = -1
            int r2 = r2 + r3
        L_0x013a:
            if (r2 < 0) goto L_0x016a
            java.util.ArrayList r3 = r13.f809e
            java.lang.Object r3 = r3.get(r2)
            android.support.v4.app.cd r3 = (android.support.p031v4.app.C0212cd) r3
            int r7 = r3.f800a
            r10 = 1
            if (r7 == r10) goto L_0x0161
            r10 = 3
            if (r7 == r10) goto L_0x015b
            switch(r7) {
                case 6: goto L_0x015b;
                case 7: goto L_0x0162;
                case 8: goto L_0x0159;
                case 9: goto L_0x0155;
                case 10: goto L_0x0150;
                default: goto L_0x014f;
            }
        L_0x014f:
            goto L_0x0167
        L_0x0150:
            androidx.lifecycle.n r7 = r3.f807h
            r3.f808i = r7
            goto L_0x0167
        L_0x0155:
            android.support.v4.app.Fragment r3 = r3.f801b
            r6 = r3
            goto L_0x0167
        L_0x0159:
            r6 = 0
            goto L_0x0167
        L_0x015b:
            android.support.v4.app.Fragment r3 = r3.f801b
            r1.add(r3)
            goto L_0x0167
        L_0x0161:
            r10 = 3
        L_0x0162:
            android.support.v4.app.Fragment r3 = r3.f801b
            r1.remove(r3)
        L_0x0167:
            int r2 = r2 + -1
            goto L_0x013a
        L_0x016a:
            if (r9 != 0) goto L_0x0173
            boolean r1 = r13.f815k
            if (r1 == 0) goto L_0x0171
            goto L_0x0173
        L_0x0171:
            r9 = 0
            goto L_0x0174
        L_0x0173:
            r9 = 1
        L_0x0174:
            int r8 = r8 + 1
            r1 = r20
            r2 = r21
            r3 = r22
            goto L_0x0030
        L_0x017e:
            java.util.ArrayList r1 = r0.f631I
            r1.clear()
            if (r5 != 0) goto L_0x01bb
            int r1 = r0.f646m
            if (r1 <= 0) goto L_0x01bb
            r1 = r22
        L_0x018b:
            if (r1 >= r4) goto L_0x01bb
            r2 = r20
            java.lang.Object r3 = r2.get(r1)
            android.support.v4.app.a r3 = (android.support.p031v4.app.C0154a) r3
            java.util.ArrayList r3 = r3.f809e
            int r5 = r3.size()
            r6 = 0
        L_0x019c:
            if (r6 >= r5) goto L_0x01b8
            java.lang.Object r7 = r3.get(r6)
            android.support.v4.app.cd r7 = (android.support.p031v4.app.C0212cd) r7
            android.support.v4.app.Fragment r7 = r7.f801b
            if (r7 == 0) goto L_0x01b5
            android.support.v4.app.FragmentManager r8 = r7.mFragmentManager
            if (r8 == 0) goto L_0x01b5
            android.support.v4.app.ca r7 = r0.mo478k(r7)
            android.support.v4.app.cc r8 = r0.f634a
            r8.mo680l(r7)
        L_0x01b5:
            int r6 = r6 + 1
            goto L_0x019c
        L_0x01b8:
            int r1 = r1 + 1
            goto L_0x018b
        L_0x01bb:
            r2 = r20
            r1 = r22
        L_0x01bf:
            if (r1 >= r4) goto L_0x03aa
            java.lang.Object r3 = r2.get(r1)
            android.support.v4.app.a r3 = (android.support.p031v4.app.C0154a) r3
            r5 = r21
            java.lang.Object r6 = r5.get(r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.String r7 = "Unknown cmd: "
            if (r6 == 0) goto L_0x02ce
            r6 = -1
            r3.mo508e(r6)
            java.util.ArrayList r8 = r3.f809e
            int r8 = r8.size()
            int r8 = r8 + r6
        L_0x01e2:
            if (r8 < 0) goto L_0x03a5
            java.util.ArrayList r6 = r3.f809e
            java.lang.Object r6 = r6.get(r8)
            android.support.v4.app.cd r6 = (android.support.p031v4.app.C0212cd) r6
            android.support.v4.app.Fragment r10 = r6.f801b
            if (r10 == 0) goto L_0x0222
            boolean r11 = r3.f693d
            r10.mBeingSaved = r11
            r11 = 1
            r10.setPopDirection(r11)
            int r11 = r3.f814j
            r12 = 8194(0x2002, float:1.1482E-41)
            r13 = 4097(0x1001, float:5.741E-42)
            if (r11 == r13) goto L_0x0218
            if (r11 == r12) goto L_0x0216
            r12 = 4100(0x1004, float:5.745E-42)
            r13 = 8197(0x2005, float:1.1486E-41)
            if (r11 == r13) goto L_0x0218
            r14 = 4099(0x1003, float:5.744E-42)
            if (r11 == r14) goto L_0x0213
            if (r11 == r12) goto L_0x0210
            r12 = 0
            goto L_0x0218
        L_0x0210:
            r12 = 8197(0x2005, float:1.1486E-41)
            goto L_0x0218
        L_0x0213:
            r12 = 4099(0x1003, float:5.744E-42)
            goto L_0x0218
        L_0x0216:
            r12 = 4097(0x1001, float:5.741E-42)
        L_0x0218:
            r10.setNextTransition(r12)
            java.util.ArrayList r11 = r3.f823s
            java.util.ArrayList r12 = r3.f822r
            r10.setSharedElementNames(r11, r12)
        L_0x0222:
            int r11 = r6.f800a
            switch(r11) {
                case 1: goto L_0x02b4;
                case 2: goto L_0x0227;
                case 3: goto L_0x02a3;
                case 4: goto L_0x0292;
                case 5: goto L_0x027b;
                case 6: goto L_0x026a;
                case 7: goto L_0x0253;
                case 8: goto L_0x024b;
                case 9: goto L_0x0244;
                case 10: goto L_0x023b;
                default: goto L_0x0227;
            }
        L_0x0227:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            int r3 = r6.f800a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x023b:
            android.support.v4.app.FragmentManager r11 = r3.f690a
            androidx.lifecycle.n r6 = r6.f807h
            r11.mo451R(r10, r6)
            goto L_0x02ca
        L_0x0244:
            android.support.v4.app.FragmentManager r6 = r3.f690a
            r6.mo452S(r10)
            goto L_0x02ca
        L_0x024b:
            android.support.v4.app.FragmentManager r6 = r3.f690a
            r10 = 0
            r6.mo452S(r10)
            goto L_0x02ca
        L_0x0253:
            int r11 = r6.f803d
            int r12 = r6.f804e
            int r13 = r6.f805f
            int r6 = r6.f806g
            r10.setAnimations(r11, r12, r13, r6)
            android.support.v4.app.FragmentManager r6 = r3.f690a
            r11 = 1
            r6.mo448O(r10, r11)
            android.support.v4.app.FragmentManager r6 = r3.f690a
            r6.mo481n(r10)
            goto L_0x02ca
        L_0x026a:
            int r11 = r6.f803d
            int r12 = r6.f804e
            int r13 = r6.f805f
            int r6 = r6.f806g
            r10.setAnimations(r11, r12, r13, r6)
            android.support.v4.app.FragmentManager r6 = r3.f690a
            r6.mo480m(r10)
            goto L_0x02ca
        L_0x027b:
            int r11 = r6.f803d
            int r12 = r6.f804e
            int r13 = r6.f805f
            int r6 = r6.f806g
            r10.setAnimations(r11, r12, r13, r6)
            android.support.v4.app.FragmentManager r6 = r3.f690a
            r11 = 1
            r6.mo448O(r10, r11)
            android.support.v4.app.FragmentManager r6 = r3.f690a
            r6.mo439F(r10)
            goto L_0x02ca
        L_0x0292:
            int r11 = r6.f803d
            int r12 = r6.f804e
            int r13 = r6.f805f
            int r6 = r6.f806g
            r10.setAnimations(r11, r12, r13, r6)
            android.support.v4.app.FragmentManager r6 = r3.f690a
            m249am(r10)
            goto L_0x02ca
        L_0x02a3:
            int r11 = r6.f803d
            int r12 = r6.f804e
            int r13 = r6.f805f
            int r6 = r6.f806g
            r10.setAnimations(r11, r12, r13, r6)
            android.support.v4.app.FragmentManager r6 = r3.f690a
            r6.mo477j(r10)
            goto L_0x02ca
        L_0x02b4:
            int r11 = r6.f803d
            int r12 = r6.f804e
            int r13 = r6.f805f
            int r6 = r6.f806g
            r10.setAnimations(r11, r12, r13, r6)
            android.support.v4.app.FragmentManager r6 = r3.f690a
            r11 = 1
            r6.mo448O(r10, r11)
            android.support.v4.app.FragmentManager r6 = r3.f690a
            r6.mo444K(r10)
        L_0x02ca:
            int r8 = r8 + -1
            goto L_0x01e2
        L_0x02ce:
            r6 = 1
            r3.mo508e(r6)
            java.util.ArrayList r6 = r3.f809e
            int r6 = r6.size()
            r8 = 0
        L_0x02d9:
            if (r8 >= r6) goto L_0x03a5
            java.util.ArrayList r10 = r3.f809e
            java.lang.Object r10 = r10.get(r8)
            android.support.v4.app.cd r10 = (android.support.p031v4.app.C0212cd) r10
            android.support.v4.app.Fragment r11 = r10.f801b
            if (r11 == 0) goto L_0x02fb
            boolean r12 = r3.f693d
            r11.mBeingSaved = r12
            r12 = 0
            r11.setPopDirection(r12)
            int r12 = r3.f814j
            r11.setNextTransition(r12)
            java.util.ArrayList r12 = r3.f822r
            java.util.ArrayList r13 = r3.f823s
            r11.setSharedElementNames(r12, r13)
        L_0x02fb:
            int r12 = r10.f800a
            switch(r12) {
                case 1: goto L_0x038b;
                case 2: goto L_0x0300;
                case 3: goto L_0x0379;
                case 4: goto L_0x0368;
                case 5: goto L_0x0351;
                case 6: goto L_0x0340;
                case 7: goto L_0x0329;
                case 8: goto L_0x0323;
                case 9: goto L_0x031c;
                case 10: goto L_0x0314;
                default: goto L_0x0300;
            }
        L_0x0300:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            int r3 = r10.f800a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0314:
            android.support.v4.app.FragmentManager r12 = r3.f690a
            androidx.lifecycle.n r10 = r10.f808i
            r12.mo451R(r11, r10)
            goto L_0x0389
        L_0x031c:
            android.support.v4.app.FragmentManager r10 = r3.f690a
            r11 = 0
            r10.mo452S(r11)
            goto L_0x0389
        L_0x0323:
            android.support.v4.app.FragmentManager r10 = r3.f690a
            r10.mo452S(r11)
            goto L_0x0389
        L_0x0329:
            int r12 = r10.f803d
            int r13 = r10.f804e
            int r14 = r10.f805f
            int r10 = r10.f806g
            r11.setAnimations(r12, r13, r14, r10)
            android.support.v4.app.FragmentManager r10 = r3.f690a
            r12 = 0
            r10.mo448O(r11, r12)
            android.support.v4.app.FragmentManager r10 = r3.f690a
            r10.mo480m(r11)
            goto L_0x0389
        L_0x0340:
            int r12 = r10.f803d
            int r13 = r10.f804e
            int r14 = r10.f805f
            int r10 = r10.f806g
            r11.setAnimations(r12, r13, r14, r10)
            android.support.v4.app.FragmentManager r10 = r3.f690a
            r10.mo481n(r11)
            goto L_0x0389
        L_0x0351:
            int r12 = r10.f803d
            int r13 = r10.f804e
            int r14 = r10.f805f
            int r10 = r10.f806g
            r11.setAnimations(r12, r13, r14, r10)
            android.support.v4.app.FragmentManager r10 = r3.f690a
            r12 = 0
            r10.mo448O(r11, r12)
            android.support.v4.app.FragmentManager r10 = r3.f690a
            m249am(r11)
            goto L_0x0389
        L_0x0368:
            int r12 = r10.f803d
            int r13 = r10.f804e
            int r14 = r10.f805f
            int r10 = r10.f806g
            r11.setAnimations(r12, r13, r14, r10)
            android.support.v4.app.FragmentManager r10 = r3.f690a
            r10.mo439F(r11)
            goto L_0x0389
        L_0x0379:
            int r12 = r10.f803d
            int r13 = r10.f804e
            int r14 = r10.f805f
            int r10 = r10.f806g
            r11.setAnimations(r12, r13, r14, r10)
            android.support.v4.app.FragmentManager r10 = r3.f690a
            r10.mo444K(r11)
        L_0x0389:
            r12 = 0
            goto L_0x03a1
        L_0x038b:
            int r12 = r10.f803d
            int r13 = r10.f804e
            int r14 = r10.f805f
            int r10 = r10.f806g
            r11.setAnimations(r12, r13, r14, r10)
            android.support.v4.app.FragmentManager r10 = r3.f690a
            r12 = 0
            r10.mo448O(r11, r12)
            android.support.v4.app.FragmentManager r10 = r3.f690a
            r10.mo477j(r11)
        L_0x03a1:
            int r8 = r8 + 1
            goto L_0x02d9
        L_0x03a5:
            r12 = 0
            int r1 = r1 + 1
            goto L_0x01bf
        L_0x03aa:
            r5 = r21
            r12 = 0
            int r1 = r4 + -1
            java.lang.Object r1 = r5.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = r22
        L_0x03bb:
            if (r3 >= r4) goto L_0x0405
            java.lang.Object r6 = r2.get(r3)
            android.support.v4.app.a r6 = (android.support.p031v4.app.C0154a) r6
            if (r1 == 0) goto L_0x03e5
            java.util.ArrayList r7 = r6.f809e
            int r7 = r7.size()
            r8 = -1
            int r7 = r7 + r8
        L_0x03cd:
            if (r7 < 0) goto L_0x0402
            java.util.ArrayList r8 = r6.f809e
            java.lang.Object r8 = r8.get(r7)
            android.support.v4.app.cd r8 = (android.support.p031v4.app.C0212cd) r8
            android.support.v4.app.Fragment r8 = r8.f801b
            if (r8 == 0) goto L_0x03e2
            android.support.v4.app.ca r8 = r0.mo478k(r8)
            r8.mo664e()
        L_0x03e2:
            int r7 = r7 + -1
            goto L_0x03cd
        L_0x03e5:
            java.util.ArrayList r6 = r6.f809e
            int r7 = r6.size()
            r8 = 0
        L_0x03ec:
            if (r8 >= r7) goto L_0x0402
            java.lang.Object r10 = r6.get(r8)
            android.support.v4.app.cd r10 = (android.support.p031v4.app.C0212cd) r10
            android.support.v4.app.Fragment r10 = r10.f801b
            if (r10 == 0) goto L_0x03ff
            android.support.v4.app.ca r10 = r0.mo478k(r10)
            r10.mo664e()
        L_0x03ff:
            int r8 = r8 + 1
            goto L_0x03ec
        L_0x0402:
            int r3 = r3 + 1
            goto L_0x03bb
        L_0x0405:
            int r3 = r0.f646m
            r6 = 1
            r0.mo440G(r3, r6)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r6 = r22
        L_0x0412:
            if (r6 >= r4) goto L_0x0441
            java.lang.Object r7 = r2.get(r6)
            android.support.v4.app.a r7 = (android.support.p031v4.app.C0154a) r7
            java.util.ArrayList r7 = r7.f809e
            int r8 = r7.size()
            r10 = 0
        L_0x0421:
            if (r10 >= r8) goto L_0x043e
            java.lang.Object r11 = r7.get(r10)
            android.support.v4.app.cd r11 = (android.support.p031v4.app.C0212cd) r11
            android.support.v4.app.Fragment r11 = r11.f801b
            if (r11 == 0) goto L_0x043b
            android.view.ViewGroup r11 = r11.mContainer
            if (r11 == 0) goto L_0x043b
            r19.mo466ag()
            android.support.v4.app.dd r11 = android.support.p031v4.app.C0239dd.m562k(r11)
            r3.add(r11)
        L_0x043b:
            int r10 = r10 + 1
            goto L_0x0421
        L_0x043e:
            int r6 = r6 + 1
            goto L_0x0412
        L_0x0441:
            java.util.Iterator r3 = r3.iterator()
        L_0x0445:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x045a
            java.lang.Object r6 = r3.next()
            android.support.v4.app.dd r6 = (android.support.p031v4.app.C0239dd) r6
            r6.f882d = r1
            r6.mo750i()
            r6.mo748g()
            goto L_0x0445
        L_0x045a:
            r1 = r22
        L_0x045c:
            if (r1 >= r4) goto L_0x049c
            java.lang.Object r3 = r2.get(r1)
            android.support.v4.app.a r3 = (android.support.p031v4.app.C0154a) r3
            java.lang.Object r6 = r5.get(r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0478
            int r6 = r3.f692c
            if (r6 < 0) goto L_0x0478
            r6 = -1
            r3.f692c = r6
            goto L_0x0479
        L_0x0478:
            r6 = -1
        L_0x0479:
            java.util.ArrayList r7 = r3.f825u
            if (r7 == 0) goto L_0x0498
            r7 = 0
        L_0x047e:
            java.util.ArrayList r8 = r3.f825u
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0494
            java.util.ArrayList r8 = r3.f825u
            java.lang.Object r8 = r8.get(r7)
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            r8.run()
            int r7 = r7 + 1
            goto L_0x047e
        L_0x0494:
            r7 = 0
            r3.f825u = r7
            goto L_0x0499
        L_0x0498:
            r7 = 0
        L_0x0499:
            int r1 = r1 + 1
            goto L_0x045c
        L_0x049c:
            if (r9 == 0) goto L_0x04bb
            java.util.ArrayList r1 = r0.f643j
            if (r1 == 0) goto L_0x04bb
            r7 = 0
        L_0x04a3:
            java.util.ArrayList r1 = r0.f643j
            int r1 = r1.size()
            if (r7 >= r1) goto L_0x04bb
            java.util.ArrayList r1 = r0.f643j
            java.lang.Object r1 = r1.get(r7)
            com.google.android.apps.search.googleapp.settingsui.bt r1 = (com.google.android.apps.search.googleapp.settingsui.C139197bt) r1
            com.google.android.apps.search.googleapp.settingsui.bu r1 = r1.f378569a
            r1.mo114815c()
            int r7 = r7 + 1
            goto L_0x04a3
        L_0x04bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p031v4.app.FragmentManager.m257av(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    /* renamed from: aw */
    private final void m258aw() {
        for (C0239dd ddVar : m251ap()) {
            if (ddVar.f883e) {
                if (m246Z(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                ddVar.f883e = false;
                ddVar.mo748g();
            }
        }
    }

    /* renamed from: ax */
    private final void m259ax(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((C0154a) arrayList.get(i)).f824t) {
                        if (i2 != i) {
                            m257av(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0154a) arrayList.get(i2)).f824t) {
                                i2++;
                            }
                        }
                        m257av(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m257av(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: ay */
    private final void m260ay(Fragment fragment) {
        ViewGroup ao = m250ao(fragment);
        if (ao != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            if (ao.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                ao.setTag(R.id.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) ao.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
        }
    }

    /* renamed from: az */
    private final void m261az() {
        for (C0209ca H : this.f634a.mo675g()) {
            mo441H(H);
        }
    }

    /* renamed from: e */
    public static Fragment m262e(View view) {
        Fragment fragment;
        View view2 = view;
        while (true) {
            fragment = null;
            if (view2 == null) {
                break;
            }
            Fragment g = m263g(view2);
            if (g != null) {
                fragment = g;
                break;
            }
            ViewParent parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        if (fragment != null) {
            return fragment;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    /* renamed from: g */
    static Fragment m263g(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: A */
    public final void mo434A(int i) {
        try {
            this.f625C = true;
            for (C0209ca caVar : this.f634a.f797b.values()) {
                if (caVar != null) {
                    caVar.f786b = i;
                }
            }
            mo440G(i, false);
            for (C0239dd h : m251ap()) {
                h.mo749h();
            }
            this.f625C = false;
            mo470an(true);
        } catch (Throwable th) {
            this.f625C = false;
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo435B() {
        this.f658y = true;
        this.f623A.f779g = true;
        mo434A(4);
    }

    /* renamed from: C */
    public final void mo436C(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String concat = String.valueOf(str).concat("    ");
        C0211cc ccVar = this.f634a;
        String concat2 = String.valueOf(str).concat("    ");
        if (!ccVar.f797b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0209ca caVar : ccVar.f797b.values()) {
                printWriter.print(str);
                if (caVar != null) {
                    Fragment fragment = caVar.f785a;
                    printWriter.println(fragment);
                    fragment.dump(concat2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = ccVar.f796a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((Fragment) ccVar.f796a.get(i)).toString());
            }
        }
        ArrayList arrayList = this.f626D;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(((Fragment) this.f626D.get(i2)).toString());
            }
        }
        ArrayList arrayList2 = this.f635b;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0154a aVar = (C0154a) this.f635b.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo512i(concat, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f639f.get());
        synchronized (this.f624B) {
            int size4 = this.f624B.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println((C0195bn) this.f624B.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f647n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f648o);
        if (this.f649p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f649p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f646m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f657x);
        printWriter.print(" mStopped=");
        printWriter.print(this.f658y);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f659z);
        if (this.f656w) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f656w);
        }
    }

    /* renamed from: D */
    public final void mo437D(C0195bn bnVar, boolean z) {
        if (!z) {
            if (this.f647n != null) {
                m252aq();
            } else if (this.f659z) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f624B) {
            if (this.f647n != null) {
                this.f624B.add(bnVar);
                synchronized (this.f624B) {
                    if (this.f624B.size() == 1) {
                        this.f647n.f743d.removeCallbacks(this.f632J);
                        this.f647n.f743d.post(this.f632J);
                        mo454U();
                    }
                }
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo438E(C0195bn bnVar, boolean z) {
        if (!z || (this.f647n != null && !this.f659z)) {
            m256au(z);
            if (bnVar.mo513j(this.f629G, this.f630H)) {
                this.f625C = true;
                try {
                    m259ax(this.f629G, this.f630H);
                } finally {
                    m253ar();
                }
            }
            mo454U();
            m254as();
            this.f634a.mo679k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo439F(Fragment fragment) {
        if (m246Z(2)) {
            new StringBuilder("hide: ").append(fragment);
            Log.v("FragmentManager", "hide: ".concat(String.valueOf(fragment)));
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            m260ay(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final void mo440G(int i, boolean z) {
        C0174at atVar;
        if (this.f647n == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f646m) {
            this.f646m = i;
            C0211cc ccVar = this.f634a;
            ArrayList arrayList = ccVar.f796a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0209ca caVar = (C0209ca) ccVar.f797b.get(((Fragment) arrayList.get(i2)).mWho);
                if (caVar != null) {
                    caVar.mo664e();
                }
            }
            for (C0209ca caVar2 : ccVar.f797b.values()) {
                if (caVar2 != null) {
                    caVar2.mo664e();
                    Fragment fragment = caVar2.f785a;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !ccVar.f798c.containsKey(fragment.mWho)) {
                            caVar2.mo666g();
                        }
                        ccVar.mo681m(caVar2);
                    }
                }
            }
            m261az();
            if (this.f656w && (atVar = this.f647n) != null && this.f646m == 7) {
                atVar.mo534g();
                this.f656w = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo441H(C0209ca caVar) {
        Fragment fragment = caVar.f785a;
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.f625C) {
            this.f628F = true;
            return;
        }
        fragment.mDeferStart = false;
        caVar.mo664e();
    }

    /* renamed from: I */
    public final void mo442I() {
        mo437D(new C0196bo(this, (String) null, -1, 0), false);
    }

    /* renamed from: J */
    public final void mo443J(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            mo453T(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo444K(Fragment fragment) {
        if (m246Z(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            this.f634a.mo682n(fragment);
            if (m247ai(fragment)) {
                this.f656w = true;
            }
            fragment.mRemoving = true;
            m260ay(fragment);
        }
    }

    /* renamed from: L */
    public final void mo445L(String str) {
        mo437D(new C0197bp(this, str), false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r1 = (android.support.p031v4.app.FragmentManagerState) r19;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo446M(android.os.Parcelable r19) {
        /*
            r18 = this;
            r0 = r18
            if (r19 != 0) goto L_0x0005
            return
        L_0x0005:
            r1 = r19
            android.support.v4.app.FragmentManagerState r1 = (android.support.p031v4.app.FragmentManagerState) r1
            java.util.ArrayList r2 = r1.f666a
            if (r2 != 0) goto L_0x000e
            return
        L_0x000e:
            android.support.v4.app.cc r3 = r0.f634a
            java.util.HashMap r4 = r3.f798c
            r4.clear()
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L_0x001b:
            if (r6 >= r4) goto L_0x002d
            java.lang.Object r7 = r2.get(r6)
            android.support.v4.app.FragmentState r7 = (android.support.p031v4.app.FragmentState) r7
            java.util.HashMap r8 = r3.f798c
            java.lang.String r9 = r7.f678b
            r8.put(r9, r7)
            int r6 = r6 + 1
            goto L_0x001b
        L_0x002d:
            android.support.v4.app.cc r2 = r0.f634a
            java.util.HashMap r2 = r2.f797b
            r2.clear()
            java.util.ArrayList r2 = r1.f667b
            int r3 = r2.size()
            r4 = 0
        L_0x003b:
            r6 = 0
            java.lang.String r7 = "): "
            java.lang.String r8 = "FragmentManager"
            r9 = 2
            if (r4 >= r3) goto L_0x00d7
            java.lang.Object r10 = r2.get(r4)
            java.lang.String r10 = (java.lang.String) r10
            android.support.v4.app.cc r11 = r0.f634a
            android.support.v4.app.FragmentState r6 = r11.mo673e(r10, r6)
            if (r6 == 0) goto L_0x00d3
            android.support.v4.app.bu r10 = r0.f623A
            java.lang.String r11 = r6.f678b
            java.util.HashMap r10 = r10.f774b
            java.lang.Object r10 = r10.get(r11)
            android.support.v4.app.Fragment r10 = (android.support.p031v4.app.Fragment) r10
            if (r10 == 0) goto L_0x0084
            boolean r11 = m246Z(r9)
            if (r11 == 0) goto L_0x007a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "restoreSaveState: re-attaching retained "
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r11 = r10.toString()
            java.lang.String r11 = r12.concat(r11)
            android.util.Log.v(r8, r11)
        L_0x007a:
            android.support.v4.app.ca r11 = new android.support.v4.app.ca
            android.support.v4.app.ax r12 = r0.f644k
            android.support.v4.app.cc r13 = r0.f634a
            r11.<init>(r12, r13, r10, r6)
            goto L_0x009c
        L_0x0084:
            android.support.v4.app.ca r11 = new android.support.v4.app.ca
            android.support.v4.app.ax r13 = r0.f644k
            android.support.v4.app.cc r14 = r0.f634a
            android.support.v4.app.at r10 = r0.f647n
            android.content.Context r10 = r10.f742c
            java.lang.ClassLoader r15 = r10.getClassLoader()
            android.support.v4.app.as r16 = r18.mo475h()
            r12 = r11
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)
        L_0x009c:
            android.support.v4.app.Fragment r6 = r11.f785a
            r6.mFragmentManager = r0
            boolean r9 = m246Z(r9)
            if (r9 == 0) goto L_0x00bf
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "restoreSaveState: active ("
            r9.<init>(r10)
            java.lang.String r10 = r6.mWho
            r9.append(r10)
            r9.append(r7)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            android.util.Log.v(r8, r6)
        L_0x00bf:
            android.support.v4.app.at r6 = r0.f647n
            android.content.Context r6 = r6.f742c
            java.lang.ClassLoader r6 = r6.getClassLoader()
            r11.mo665f(r6)
            android.support.v4.app.cc r6 = r0.f634a
            r6.mo680l(r11)
            int r6 = r0.f646m
            r11.f786b = r6
        L_0x00d3:
            int r4 = r4 + 1
            goto L_0x003b
        L_0x00d7:
            android.support.v4.app.bu r2 = r0.f623A
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.HashMap r2 = r2.f774b
            java.util.Collection r2 = r2.values()
            r3.<init>(r2)
            java.util.Iterator r2 = r3.iterator()
        L_0x00e8:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x013b
            java.lang.Object r3 = r2.next()
            android.support.v4.app.Fragment r3 = (android.support.p031v4.app.Fragment) r3
            android.support.v4.app.cc r10 = r0.f634a
            java.lang.String r11 = r3.mWho
            boolean r10 = r10.mo683o(r11)
            if (r10 != 0) goto L_0x00e8
            boolean r10 = m246Z(r9)
            if (r10 == 0) goto L_0x0120
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Discarding retained Fragment "
            r10.<init>(r11)
            r10.append(r3)
            java.lang.String r11 = " that was not found in the set of active Fragments "
            r10.append(r11)
            java.util.ArrayList r11 = r1.f667b
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.v(r8, r10)
        L_0x0120:
            android.support.v4.app.bu r10 = r0.f623A
            r10.mo640e(r3)
            r3.mFragmentManager = r0
            android.support.v4.app.ca r10 = new android.support.v4.app.ca
            android.support.v4.app.ax r11 = r0.f644k
            android.support.v4.app.cc r12 = r0.f634a
            r10.<init>(r11, r12, r3)
            r10.f786b = r4
            r10.mo664e()
            r3.mRemoving = r4
            r10.mo664e()
            goto L_0x00e8
        L_0x013b:
            android.support.v4.app.cc r2 = r0.f634a
            java.util.ArrayList r3 = r1.f668c
            java.util.ArrayList r10 = r2.f796a
            r10.clear()
            if (r3 == 0) goto L_0x0196
            java.util.Iterator r3 = r3.iterator()
        L_0x014a:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x0196
            java.lang.Object r10 = r3.next()
            java.lang.String r10 = (java.lang.String) r10
            android.support.v4.app.Fragment r11 = r2.mo669a(r10)
            if (r11 == 0) goto L_0x017d
            boolean r12 = m246Z(r9)
            if (r12 == 0) goto L_0x0179
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "restoreSaveState: added ("
            r12.<init>(r13)
            r12.append(r10)
            r12.append(r7)
            r12.append(r11)
            java.lang.String r10 = r12.toString()
            android.util.Log.v(r8, r10)
        L_0x0179:
            r2.mo678j(r11)
            goto L_0x014a
        L_0x017d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "No instantiated fragment for ("
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0196:
            android.support.v4.app.BackStackRecordState[] r2 = r1.f669d
            if (r2 == 0) goto L_0x0220
            int r2 = r2.length
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r0.f635b = r3
            r2 = 0
        L_0x01a3:
            android.support.v4.app.BackStackRecordState[] r3 = r1.f669d
            int r6 = r3.length
            if (r2 >= r6) goto L_0x0222
            r3 = r3[r2]
            android.support.v4.app.a r6 = new android.support.v4.app.a
            r6.<init>((android.support.p031v4.app.FragmentManager) r0)
            r3.mo233a(r6)
            int r10 = r3.f607g
            r6.f692c = r10
            r10 = 0
        L_0x01b7:
            java.util.ArrayList r11 = r3.f602b
            int r11 = r11.size()
            if (r10 >= r11) goto L_0x01dc
            java.util.ArrayList r11 = r3.f602b
            java.lang.Object r11 = r11.get(r10)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x01d9
            java.util.ArrayList r12 = r6.f809e
            java.lang.Object r12 = r12.get(r10)
            android.support.v4.app.cd r12 = (android.support.p031v4.app.C0212cd) r12
            android.support.v4.app.cc r13 = r0.f634a
            android.support.v4.app.Fragment r11 = r13.mo669a(r11)
            r12.f801b = r11
        L_0x01d9:
            int r10 = r10 + 1
            goto L_0x01b7
        L_0x01dc:
            r6.mo508e(r4)
            boolean r3 = m246Z(r9)
            if (r3 == 0) goto L_0x0218
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r10 = "restoreAllState: back stack #"
            r3.<init>(r10)
            r3.append(r2)
            java.lang.String r10 = " (index "
            r3.append(r10)
            int r10 = r6.f692c
            r3.append(r10)
            r3.append(r7)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r8, r3)
            android.support.v4.app.ct r3 = new android.support.v4.app.ct
            r3.<init>()
            java.io.PrintWriter r10 = new java.io.PrintWriter
            r10.<init>(r3)
            java.lang.String r3 = "  "
            r6.mo512i(r3, r10, r5)
            r10.close()
        L_0x0218:
            java.util.ArrayList r3 = r0.f635b
            r3.add(r6)
            int r2 = r2 + 1
            goto L_0x01a3
        L_0x0220:
            r0.f635b = r6
        L_0x0222:
            java.util.concurrent.atomic.AtomicInteger r2 = r0.f639f
            int r3 = r1.f670e
            r2.set(r3)
            java.lang.String r2 = r1.f671f
            if (r2 == 0) goto L_0x0238
            android.support.v4.app.cc r3 = r0.f634a
            android.support.v4.app.Fragment r2 = r3.mo669a(r2)
            r0.f650q = r2
            r0.mo492w(r2)
        L_0x0238:
            java.util.ArrayList r2 = r1.f672g
            if (r2 == 0) goto L_0x0259
            r3 = 0
        L_0x023d:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x0259
            java.util.Map r4 = r0.f640g
            java.lang.Object r6 = r2.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            java.util.ArrayList r7 = r1.f673h
            java.lang.Object r7 = r7.get(r3)
            android.support.v4.app.BackStackState r7 = (android.support.p031v4.app.BackStackState) r7
            r4.put(r6, r7)
            int r3 = r3 + 1
            goto L_0x023d
        L_0x0259:
            java.util.ArrayList r2 = r1.f674i
            if (r2 == 0) goto L_0x0284
        L_0x025d:
            int r3 = r2.size()
            if (r5 >= r3) goto L_0x0284
            java.util.ArrayList r3 = r1.f675j
            java.lang.Object r3 = r3.get(r5)
            android.os.Bundle r3 = (android.os.Bundle) r3
            android.support.v4.app.at r4 = r0.f647n
            android.content.Context r4 = r4.f742c
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r3.setClassLoader(r4)
            java.util.Map r4 = r0.f641h
            java.lang.Object r6 = r2.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            r4.put(r6, r3)
            int r5 = r5 + 1
            goto L_0x025d
        L_0x0284:
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            java.util.ArrayList r1 = r1.f676k
            r2.<init>(r1)
            r0.f655v = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p031v4.app.FragmentManager.mo446M(android.os.Parcelable):void");
    }

    /* renamed from: N */
    public final void mo447N(String str) {
        mo437D(new C0198bq(this, str), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final void mo448O(Fragment fragment, boolean z) {
        ViewGroup ao = m250ao(fragment);
        if (ao != null && (ao instanceof FragmentContainerView)) {
            ((FragmentContainerView) ao).f619a = !z;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo449P(java.lang.String r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.util.Map r0 = r3.f642i
            java.lang.Object r0 = r0.get(r4)
            android.support.v4.app.bm r0 = (android.support.p031v4.app.C0194bm) r0
            if (r0 == 0) goto L_0x001c
            androidx.lifecycle.n r1 = androidx.lifecycle.C2383n.STARTED
            androidx.lifecycle.o r2 = r0.f762a
            androidx.lifecycle.n r2 = r2.mo5789a()
            boolean r1 = r2.mo5788a(r1)
            if (r1 == 0) goto L_0x001c
            r0.mo631a(r4, r5)
            goto L_0x0021
        L_0x001c:
            java.util.Map r0 = r3.f641h
            r0.put(r4, r5)
        L_0x0021:
            r0 = 2
            boolean r0 = m246Z(r0)
            if (r0 == 0) goto L_0x0043
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Setting fragment result with key "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " and result "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = "FragmentManager"
            java.lang.String r5 = r0.toString()
            android.util.Log.v(r4, r5)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p031v4.app.FragmentManager.mo449P(java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: Q */
    public final void mo450Q(final String str, C2391v vVar, final C0205bx bxVar) {
        final C2384o lifecycle = vVar.getLifecycle();
        if (lifecycle.mo5789a() != C2383n.DESTROYED) {
            C01535 r0 = new C2389t() {
                /* renamed from: eN */
                public final void mo416eN(C2391v vVar, C2382m mVar) {
                    Bundle bundle;
                    if (mVar == C2382m.ON_START && (bundle = (Bundle) FragmentManager.this.f641h.get(str)) != null) {
                        bxVar.mo631a(str, bundle);
                        FragmentManager fragmentManager = FragmentManager.this;
                        String str = str;
                        fragmentManager.f641h.remove(str);
                        if (FragmentManager.m246Z(2)) {
                            Log.v("FragmentManager", "Clearing fragment result with key ".concat(str));
                        }
                    }
                    if (mVar == C2382m.ON_DESTROY) {
                        lifecycle.mo5791c(this);
                        FragmentManager.this.f642i.remove(str);
                    }
                }
            };
            lifecycle.mo5790b(r0);
            C0194bm bmVar = (C0194bm) this.f642i.put(str, new C0194bm(lifecycle, bxVar, r0));
            if (bmVar != null) {
                bmVar.f762a.mo5791c(bmVar.f763b);
            }
            if (m246Z(2)) {
                Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + bxVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final void mo451R(Fragment fragment, C2383n nVar) {
        if (!fragment.equals(this.f634a.mo669a(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final void mo452S(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f634a.mo669a(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.f650q;
        this.f650q = fragment;
        mo492w(fragment2);
        mo492w(this.f650q);
    }

    /* renamed from: T */
    public final void mo453T(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0228ct());
        C0174at atVar = this.f647n;
        if (atVar != null) {
            try {
                atVar.mo537i(printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                mo436C("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (mo471b() <= 0) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (mo460aa(r4.f649p) == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r0.mo3352c(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r4.f638e;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo454U() {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.f624B
            monitor-enter(r0)
            java.util.ArrayList r1 = r4.f624B     // Catch:{ all -> 0x002b }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002b }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.m r1 = r4.f638e     // Catch:{ all -> 0x002b }
            r1.mo3352c(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            androidx.activity.m r0 = r4.f638e
            int r1 = r4.mo471b()
            r3 = 0
            if (r1 <= 0) goto L_0x0026
            android.support.v4.app.Fragment r1 = r4.f649p
            boolean r1 = r4.mo460aa(r1)
            if (r1 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            r0.mo3352c(r2)
            return
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p031v4.app.FragmentManager.mo454U():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final boolean mo455V(MenuItem menuItem) {
        if (this.f646m <= 0) {
            return false;
        }
        for (Fragment fragment : this.f634a.mo677i()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final boolean mo456W(Menu menu, MenuInflater menuInflater) {
        if (this.f646m <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f634a.mo677i()) {
            if (fragment != null && m248aj(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f626D != null) {
            for (int i = 0; i < this.f626D.size(); i++) {
                Fragment fragment2 = (Fragment) this.f626D.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f626D = arrayList;
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final boolean mo457X(MenuItem menuItem) {
        if (this.f646m <= 0) {
            return false;
        }
        for (Fragment fragment : this.f634a.mo677i()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final boolean mo458Y(Menu menu) {
        boolean z = false;
        if (this.f646m <= 0) {
            return false;
        }
        for (Fragment fragment : this.f634a.mo677i()) {
            if (fragment != null && m248aj(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final int mo459a(String str, int i, boolean z) {
        ArrayList arrayList = this.f635b;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str != null || i >= 0) {
            int size = this.f635b.size() - 1;
            while (size >= 0) {
                C0154a aVar = (C0154a) this.f635b.get(size);
                if ((str != null && str.equals(aVar.f817m)) || (i >= 0 && i == aVar.f692c)) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return size;
            }
            if (z) {
                while (size > 0) {
                    int i2 = size - 1;
                    C0154a aVar2 = (C0154a) this.f635b.get(i2);
                    if ((str == null || !str.equals(aVar2.f817m)) && (i < 0 || i != aVar2.f692c)) {
                        return size;
                    }
                    size = i2;
                }
                return size;
            } else if (size == this.f635b.size() - 1) {
                return -1;
            } else {
                return size + 1;
            }
        } else if (z) {
            return 0;
        } else {
            return this.f635b.size() - 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aa */
    public final boolean mo460aa(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (!fragment.equals(fragmentManager.f650q) || !mo460aa(fragmentManager.f649p)) {
            return false;
        }
        return true;
    }

    /* renamed from: ab */
    public final boolean mo461ab() {
        return this.f657x || this.f658y;
    }

    /* renamed from: ac */
    public final boolean mo462ac() {
        return mo463ad((String) null, -1, 0);
    }

    /* renamed from: ad */
    public final boolean mo463ad(String str, int i, int i2) {
        mo470an(false);
        m256au(true);
        Fragment fragment = this.f650q;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().mo462ac()) {
            return true;
        }
        boolean ae = mo464ae(this.f629G, this.f630H, str, i, i2);
        if (ae) {
            this.f625C = true;
            try {
                m259ax(this.f629G, this.f630H);
            } finally {
                m253ar();
            }
        }
        mo454U();
        m254as();
        this.f634a.mo679k();
        return ae;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ae */
    public final boolean mo464ae(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int a = mo459a(str, i, 1 == i2);
        if (a < 0) {
            return false;
        }
        int size = this.f635b.size();
        while (true) {
            size--;
            if (size < a) {
                return true;
            }
            arrayList.add((C0154a) this.f635b.remove(size));
            arrayList2.add(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: af */
    public final boolean mo465af(ArrayList arrayList, ArrayList arrayList2, String str) {
        BackStackState backStackState = (BackStackState) this.f640g.remove(str);
        boolean z = false;
        if (backStackState == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0154a aVar = (C0154a) arrayList.get(i);
            if (aVar.f693d) {
                ArrayList arrayList3 = aVar.f809e;
                int size2 = arrayList3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Fragment fragment = ((C0212cd) arrayList3.get(i2)).f801b;
                    if (fragment != null) {
                        hashMap.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        HashMap hashMap2 = new HashMap(backStackState.f615a.size());
        for (String str2 : backStackState.f615a) {
            Fragment fragment2 = (Fragment) hashMap.get(str2);
            if (fragment2 != null) {
                hashMap2.put(fragment2.mWho, fragment2);
            } else {
                FragmentState e = this.f634a.mo673e(str2, (FragmentState) null);
                if (e != null) {
                    Fragment a = e.mo500a(mo475h(), this.f647n.f742c.getClassLoader());
                    hashMap2.put(a.mWho, a);
                }
            }
        }
        ArrayList<C0154a> arrayList4 = new ArrayList<>();
        for (BackStackRecordState backStackRecordState : backStackState.f616b) {
            C0154a aVar2 = new C0154a(this);
            backStackRecordState.mo233a(aVar2);
            for (int i3 = 0; i3 < backStackRecordState.f602b.size(); i3++) {
                String str3 = (String) backStackRecordState.f602b.get(i3);
                if (str3 != null) {
                    Fragment fragment3 = (Fragment) hashMap2.get(str3);
                    if (fragment3 != null) {
                        ((C0212cd) aVar2.f809e.get(i3)).f801b = fragment3;
                    } else {
                        throw new IllegalStateException("Restoring FragmentTransaction " + backStackRecordState.f606f + " failed due to missing saved state for Fragment (" + str3 + ")");
                    }
                }
            }
            arrayList4.add(aVar2);
        }
        for (C0154a j : arrayList4) {
            j.mo513j(arrayList, arrayList2);
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ag */
    public final C0183bb mo466ag() {
        Fragment fragment = this.f649p;
        return fragment != null ? fragment.mFragmentManager.mo466ag() : this.f633K;
    }

    /* renamed from: ah */
    public final void mo467ah() {
        mo470an(true);
        m258aw();
    }

    /* renamed from: ak */
    public final void mo468ak(String str) {
        mo437D(new C0196bo(this, str, -1, 1), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: an */
    public final void mo470an(boolean z) {
        m256au(z);
        while (true) {
            ArrayList arrayList = this.f629G;
            ArrayList arrayList2 = this.f630H;
            synchronized (this.f624B) {
                if (this.f624B.isEmpty()) {
                    break;
                }
                try {
                    int size = this.f624B.size();
                    boolean z2 = false;
                    for (int i = 0; i < size; i++) {
                        z2 |= ((C0195bn) this.f624B.get(i)).mo513j(arrayList, arrayList2);
                    }
                    if (!z2) {
                        break;
                    }
                    this.f625C = true;
                    try {
                        m259ax(this.f629G, this.f630H);
                    } finally {
                        m253ar();
                    }
                } finally {
                    this.f624B.clear();
                    this.f647n.f743d.removeCallbacks(this.f632J);
                }
            }
        }
        mo454U();
        m254as();
        this.f634a.mo679k();
    }

    /* renamed from: b */
    public final int mo471b() {
        ArrayList arrayList = this.f635b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Parcelable mo472c() {
        ArrayList arrayList;
        int size;
        m258aw();
        m255at();
        mo470an(true);
        this.f657x = true;
        this.f623A.f779g = true;
        C0211cc ccVar = this.f634a;
        ArrayList arrayList2 = new ArrayList(ccVar.f797b.size());
        for (C0209ca caVar : ccVar.f797b.values()) {
            if (caVar != null) {
                Fragment fragment = caVar.f785a;
                caVar.mo666g();
                arrayList2.add(fragment.mWho);
                if (m246Z(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(this.f634a.f798c.values());
        BackStackRecordState[] backStackRecordStateArr = null;
        if (arrayList3.isEmpty()) {
            if (m246Z(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        C0211cc ccVar2 = this.f634a;
        synchronized (ccVar2.f796a) {
            if (ccVar2.f796a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(ccVar2.f796a.size());
                Iterator it = ccVar2.f796a.iterator();
                while (it.hasNext()) {
                    Fragment fragment2 = (Fragment) it.next();
                    arrayList.add(fragment2.mWho);
                    if (m246Z(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                    }
                }
            }
        }
        ArrayList arrayList4 = this.f635b;
        if (arrayList4 != null && (size = arrayList4.size()) > 0) {
            backStackRecordStateArr = new BackStackRecordState[size];
            for (int i = 0; i < size; i++) {
                backStackRecordStateArr[i] = new BackStackRecordState((C0154a) this.f635b.get(i));
                if (m246Z(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f635b.get(i));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f666a = arrayList3;
        fragmentManagerState.f667b = arrayList2;
        fragmentManagerState.f668c = arrayList;
        fragmentManagerState.f669d = backStackRecordStateArr;
        fragmentManagerState.f670e = this.f639f.get();
        Fragment fragment3 = this.f650q;
        if (fragment3 != null) {
            fragmentManagerState.f671f = fragment3.mWho;
        }
        fragmentManagerState.f672g.addAll(this.f640g.keySet());
        fragmentManagerState.f673h.addAll(this.f640g.values());
        fragmentManagerState.f674i.addAll(this.f641h.keySet());
        fragmentManagerState.f675j.addAll(this.f641h.values());
        fragmentManagerState.f676k = new ArrayList(this.f655v);
        return fragmentManagerState;
    }

    /* renamed from: d */
    public final Fragment.SavedState mo473d(Fragment fragment) {
        Bundle a;
        C0209ca f = this.f634a.mo674f(fragment.mWho);
        if (f == null || !f.f785a.equals(fragment)) {
            mo453T(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        if (f.f785a.mState < 0 || (a = f.mo660a()) == null) {
            return null;
        }
        return new Fragment.SavedState(a);
    }

    /* renamed from: f */
    public final Fragment mo474f(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment a = this.f634a.mo669a(string);
        if (a == null) {
            mo453T(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return a;
    }

    /* renamed from: h */
    public final C0173as mo475h() {
        C0173as asVar = this.f651r;
        if (asVar != null) {
            return asVar;
        }
        Fragment fragment = this.f649p;
        return fragment != null ? fragment.mFragmentManager.mo475h() : this.f627E;
    }

    /* renamed from: i */
    public final C0189bh mo476i(int i) {
        return (C0189bh) this.f635b.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C0209ca mo477j(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            C2284e.m6220a(fragment, str);
        }
        if (m246Z(2)) {
            new StringBuilder("add: ").append(fragment);
            Log.v("FragmentManager", "add: ".concat(String.valueOf(fragment)));
        }
        C0209ca k = mo478k(fragment);
        fragment.mFragmentManager = this;
        this.f634a.mo680l(k);
        if (!fragment.mDetached) {
            this.f634a.mo678j(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m247ai(fragment)) {
                this.f656w = true;
            }
        }
        return k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final C0209ca mo478k(Fragment fragment) {
        C0209ca f = this.f634a.mo674f(fragment.mWho);
        if (f != null) {
            return f;
        }
        C0209ca caVar = new C0209ca(this.f644k, this.f634a, fragment);
        caVar.mo665f(this.f647n.f742c.getClassLoader());
        caVar.f786b = this.f646m;
        return caVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: androidx.activity.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: android.support.v4.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: android.support.v4.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: android.support.v4.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo479l(android.support.p031v4.app.C0174at r3, android.support.p031v4.app.C0171aq r4, android.support.p031v4.app.Fragment r5) {
        /*
            r2 = this;
            android.support.v4.app.at r0 = r2.f647n
            if (r0 != 0) goto L_0x011d
            r2.f647n = r3
            r2.f648o = r4
            r2.f649p = r5
            if (r5 == 0) goto L_0x0017
            android.support.v4.app.bd r4 = new android.support.v4.app.bd
            r4.<init>(r5)
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.f645l
            r0.add(r4)
            goto L_0x0023
        L_0x0017:
            boolean r4 = r3 instanceof android.support.p031v4.app.C0203bv
            if (r4 == 0) goto L_0x0023
            r4 = r3
            android.support.v4.app.bv r4 = (android.support.p031v4.app.C0203bv) r4
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.f645l
            r0.add(r4)
        L_0x0023:
            android.support.v4.app.Fragment r4 = r2.f649p
            if (r4 == 0) goto L_0x002a
            r2.mo454U()
        L_0x002a:
            boolean r4 = r3 instanceof androidx.activity.C0823s
            if (r4 == 0) goto L_0x003f
            r4 = r3
            androidx.activity.s r4 = (androidx.activity.C0823s) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.mo535gz()
            r2.f637d = r0
            if (r5 == 0) goto L_0x003a
            r4 = r5
        L_0x003a:
            androidx.activity.m r1 = r2.f638e
            r0.mo3339b(r4, r1)
        L_0x003f:
            if (r5 == 0) goto L_0x0062
            android.support.v4.app.FragmentManager r3 = r5.mFragmentManager
            android.support.v4.app.bu r3 = r3.f623A
            java.util.HashMap r4 = r3.f775c
            java.lang.String r0 = r5.mWho
            java.lang.Object r4 = r4.get(r0)
            android.support.v4.app.bu r4 = (android.support.p031v4.app.C0202bu) r4
            if (r4 != 0) goto L_0x005f
            android.support.v4.app.bu r4 = new android.support.v4.app.bu
            boolean r0 = r3.f777e
            r4.<init>(r0)
            java.util.HashMap r3 = r3.f775c
            java.lang.String r0 = r5.mWho
            r3.put(r0, r4)
        L_0x005f:
            r2.f623A = r4
            goto L_0x0086
        L_0x0062:
            boolean r4 = r3 instanceof androidx.lifecycle.C2371bs
            if (r4 == 0) goto L_0x007e
            androidx.lifecycle.bs r3 = (androidx.lifecycle.C2371bs) r3
            androidx.lifecycle.br r3 = r3.getViewModelStore()
            androidx.lifecycle.bp r4 = new androidx.lifecycle.bp
            androidx.lifecycle.bk r0 = android.support.p031v4.app.C0202bu.f773a
            r4.<init>((androidx.lifecycle.C2370br) r3, (androidx.lifecycle.C2363bk) r0)
            java.lang.Class<android.support.v4.app.bu> r3 = android.support.p031v4.app.C0202bu.class
            androidx.lifecycle.bf r3 = r4.mo5770a(r3)
            android.support.v4.app.bu r3 = (android.support.p031v4.app.C0202bu) r3
            r2.f623A = r3
            goto L_0x0086
        L_0x007e:
            android.support.v4.app.bu r3 = new android.support.v4.app.bu
            r4 = 0
            r3.<init>(r4)
            r2.f623A = r3
        L_0x0086:
            android.support.v4.app.bu r3 = r2.f623A
            boolean r4 = r2.mo461ab()
            r3.f779g = r4
            android.support.v4.app.cc r4 = r2.f634a
            r4.f799d = r3
            android.support.v4.app.at r3 = r2.f647n
            boolean r4 = r3 instanceof androidx.savedstate.C4091g
            if (r4 == 0) goto L_0x00b7
            if (r5 != 0) goto L_0x00b7
            androidx.savedstate.g r3 = (androidx.savedstate.C4091g) r3
            androidx.savedstate.d r3 = r3.getSavedStateRegistry()
            android.support.v4.app.ay r4 = new android.support.v4.app.ay
            r4.<init>(r2)
            java.lang.String r0 = "android:support:fragments"
            r3.mo8585b(r0, r4)
            android.os.Bundle r3 = r3.mo8584a(r0)
            if (r3 == 0) goto L_0x00b7
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r2.mo446M(r3)
        L_0x00b7:
            android.support.v4.app.at r3 = r2.f647n
            boolean r4 = r3 instanceof androidx.activity.result.C0821h
            if (r4 == 0) goto L_0x011c
            androidx.activity.result.h r3 = (androidx.activity.result.C0821h) r3
            androidx.activity.result.ActivityResultRegistry r3 = r3.mo539jy()
            if (r5 == 0) goto L_0x00d2
            java.lang.String r4 = r5.mWho
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = ":"
            java.lang.String r4 = r4.concat(r5)
            goto L_0x00d4
        L_0x00d2:
            java.lang.String r4 = ""
        L_0x00d4:
            java.lang.String r5 = "FragmentManager:"
            java.lang.String r4 = r5.concat(r4)
            androidx.activity.result.a.f r5 = new androidx.activity.result.a.f
            r5.<init>()
            android.support.v4.app.be r0 = new android.support.v4.app.be
            r0.<init>(r2)
            java.lang.String r1 = "StartActivityForResult"
            java.lang.String r1 = r4.concat(r1)
            androidx.activity.result.c r5 = r3.mo3359b(r1, r5, r0)
            r2.f652s = r5
            android.support.v4.app.bj r5 = new android.support.v4.app.bj
            r5.<init>()
            android.support.v4.app.bf r0 = new android.support.v4.app.bf
            r0.<init>(r2)
            java.lang.String r1 = "StartIntentSenderForResult"
            java.lang.String r1 = r4.concat(r1)
            androidx.activity.result.c r5 = r3.mo3359b(r1, r5, r0)
            r2.f653t = r5
            androidx.activity.result.a.d r5 = new androidx.activity.result.a.d
            r5.<init>()
            android.support.v4.app.bg r0 = new android.support.v4.app.bg
            r0.<init>(r2)
            java.lang.String r1 = "RequestPermissions"
            java.lang.String r4 = r4.concat(r1)
            androidx.activity.result.c r3 = r3.mo3359b(r4, r5, r0)
            r2.f654u = r3
        L_0x011c:
            return
        L_0x011d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p031v4.app.FragmentManager.mo479l(android.support.v4.app.at, android.support.v4.app.aq, android.support.v4.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo480m(Fragment fragment) {
        if (m246Z(2)) {
            new StringBuilder("attach: ").append(fragment);
            Log.v("FragmentManager", "attach: ".concat(String.valueOf(fragment)));
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f634a.mo678j(fragment);
                if (m246Z(2)) {
                    new StringBuilder("add from attach: ").append(fragment);
                    Log.v("FragmentManager", "add from attach: ".concat(String.valueOf(fragment)));
                }
                if (m247ai(fragment)) {
                    this.f656w = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo481n(Fragment fragment) {
        if (m246Z(2)) {
            new StringBuilder("detach: ").append(fragment);
            Log.v("FragmentManager", "detach: ".concat(String.valueOf(fragment)));
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (m246Z(2)) {
                    new StringBuilder("remove from detach: ").append(fragment);
                    Log.v("FragmentManager", "remove from detach: ".concat(String.valueOf(fragment)));
                }
                this.f634a.mo682n(fragment);
                if (m247ai(fragment)) {
                    this.f656w = true;
                }
                m260ay(fragment);
            }
        }
    }

    public void noteStateNotSaved() {
        if (this.f647n != null) {
            this.f657x = false;
            this.f658y = false;
            this.f623A.f779g = false;
            for (Fragment fragment : this.f634a.mo677i()) {
                if (fragment != null) {
                    fragment.noteStateNotSaved();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo483o() {
        this.f657x = false;
        this.f658y = false;
        this.f623A.f779g = false;
        mo434A(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo484p(Configuration configuration) {
        for (Fragment fragment : this.f634a.mo677i()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo485q() {
        this.f657x = false;
        this.f658y = false;
        this.f623A.f779g = false;
        mo434A(1);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo486r() {
        /*
            r6 = this;
            r0 = 1
            r6.f659z = r0
            r6.mo470an(r0)
            r6.m255at()
            android.support.v4.app.at r1 = r6.f647n
            boolean r2 = r1 instanceof androidx.lifecycle.C2371bs
            if (r2 == 0) goto L_0x0016
            android.support.v4.app.cc r0 = r6.f634a
            android.support.v4.app.bu r0 = r0.f799d
            boolean r0 = r0.f778f
            goto L_0x0023
        L_0x0016:
            android.content.Context r1 = r1.f742c
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0025
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r0 = r0 ^ r1
        L_0x0023:
            if (r0 == 0) goto L_0x006b
        L_0x0025:
            java.util.Map r0 = r6.f640g
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x006b
            java.lang.Object r1 = r0.next()
            android.support.v4.app.BackStackState r1 = (android.support.p031v4.app.BackStackState) r1
            java.util.List r1 = r1.f615a
            java.util.Iterator r1 = r1.iterator()
        L_0x0041:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x002f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            android.support.v4.app.cc r3 = r6.f634a
            android.support.v4.app.bu r3 = r3.f799d
            r4 = 3
            boolean r4 = m246Z(r4)
            if (r4 == 0) goto L_0x0067
            java.lang.String r4 = "Clearing non-config state for saved state of Fragment "
            java.lang.String r5 = java.lang.String.valueOf(r2)
            java.lang.String r4 = r4.concat(r5)
            java.lang.String r5 = "FragmentManager"
            android.util.Log.d(r5, r4)
        L_0x0067:
            r3.mo638c(r2)
            goto L_0x0041
        L_0x006b:
            r0 = -1
            r6.mo434A(r0)
            r0 = 0
            r6.f647n = r0
            r6.f648o = r0
            r6.f649p = r0
            androidx.activity.OnBackPressedDispatcher r1 = r6.f637d
            if (r1 == 0) goto L_0x0081
            androidx.activity.m r1 = r6.f638e
            r1.mo3351b()
            r6.f637d = r0
        L_0x0081:
            androidx.activity.result.c r0 = r6.f652s
            if (r0 == 0) goto L_0x0092
            r0.mo525a()
            androidx.activity.result.c r0 = r6.f653t
            r0.mo525a()
            androidx.activity.result.c r0 = r6.f654u
            r0.mo525a()
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p031v4.app.FragmentManager.mo486r():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo487s() {
        for (Fragment fragment : this.f634a.mo677i()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo488t(boolean z) {
        for (Fragment fragment : this.f634a.mo677i()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f649p;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f649p)));
            sb.append("}");
        } else {
            C0174at atVar = this.f647n;
            if (atVar != null) {
                sb.append(atVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f647n)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo490u() {
        for (Fragment fragment : this.f634a.mo676h()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.mo490u();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo491v(Menu menu) {
        if (this.f646m > 0) {
            for (Fragment fragment : this.f634a.mo677i()) {
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* renamed from: w */
    public final void mo492w(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f634a.mo669a(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo493x(boolean z) {
        for (Fragment fragment : this.f634a.mo677i()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo494y() {
        this.f657x = false;
        this.f658y = false;
        this.f623A.f779g = false;
        mo434A(7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo495z() {
        this.f657x = false;
        this.f658y = false;
        this.f623A.f779g = false;
        mo434A(5);
    }

    /* renamed from: al */
    public final void mo469al(int i) {
        if (i >= 0) {
            mo463ad((String) null, i, 1);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }
}
