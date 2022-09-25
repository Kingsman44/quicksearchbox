package com.google.android.gms.clearcut;

import android.content.Context;
import com.google.android.gms.clearcut.internal.C143641i;
import com.google.android.gms.clearcut.internal.C143654v;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.common.base.C58827ar;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.gms.clearcut.k */
/* compiled from: PG */
public final class C143658k {

    /* renamed from: a */
    public static final C143840l f389474a;

    /* renamed from: b */
    public static final C143707a f389475b;
    @Deprecated

    /* renamed from: c */
    public static final C143841m f389476c;

    /* renamed from: d */
    public static final ExperimentTokens[] f389477d = new ExperimentTokens[0];

    /* renamed from: e */
    public static final String[] f389478e = new String[0];

    /* renamed from: f */
    public static final List f389479f = new CopyOnWriteArrayList();

    /* renamed from: g */
    public static volatile int f389480g = -1;

    /* renamed from: h */
    public final C143659l f389481h;

    /* renamed from: i */
    public final Context f389482i;

    /* renamed from: j */
    public final String f389483j;

    /* renamed from: k */
    public final EnumSet f389484k;

    /* renamed from: l */
    public final C143621ab f389485l;

    /* renamed from: m */
    public final List f389486m;

    /* renamed from: n */
    public final String f389487n;

    /* renamed from: o */
    public final String f389488o;

    /* renamed from: p */
    public int f389489p;

    static {
        C143840l lVar = new C143840l();
        f389474a = lVar;
        C143629f fVar = new C143629f();
        f389475b = fVar;
        f389476c = new C143841m("ClearcutLogger.API", fVar, lVar);
    }

    public C143658k(Context context, String str, String str2) {
        this(context, str, str2, C143624ae.f389411e, C143641i.m233330c(context), new C143654v(context));
    }

    /* renamed from: a */
    public static /* synthetic */ long m233372a(long j) {
        return (long) (TimeZone.getDefault().getOffset(j) / 1000);
    }

    /* renamed from: b */
    public static C143631h m233373b(Context context, String str) {
        return new C143631h(context, str);
    }

    /* renamed from: c */
    public static C143631h m233374c(Context context, String str) {
        C143631h hVar = new C143631h(context, str);
        hVar.mo118953b(C143624ae.f389412f);
        return hVar;
    }

    /* renamed from: f */
    public static C143658k m233375f(Context context, String str) {
        C143631h hVar = new C143631h(context, str);
        hVar.mo118953b(C143624ae.f389413g);
        return hVar.mo118952a();
    }

    /* renamed from: g */
    public static String m233376g(Iterable iterable) {
        return new C58827ar(", ").mo56097d(iterable);
    }

    /* renamed from: i */
    public static void m233377i(EnumSet enumSet) {
        if (!enumSet.equals(C143624ae.f389413g) && !enumSet.equals(C143624ae.f389411e) && !enumSet.equals(C143624ae.f389412f)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or PIILevel.DEIDENTIFIED");
        }
    }

    /* renamed from: j */
    public static void m233378j(EnumSet enumSet, String str) {
        if (!enumSet.contains(C143624ae.ACCOUNT_NAME)) {
            C143919bh.m233960c(str == null, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        m233377i(enumSet);
    }

    /* renamed from: l */
    public static int[] m233379l(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    @Deprecated
    /* renamed from: d */
    public final C143657j mo118999d(MessageLite messageLite) {
        Objects.requireNonNull(messageLite);
        return new C143657j(this, (C63088z) null, new C143628e(messageLite));
    }

    /* renamed from: e */
    public final C143657j mo119000e(MessageLite messageLite, C143623ad adVar) {
        C143919bh.m233958a(messageLite);
        Objects.requireNonNull(messageLite);
        C143657j jVar = new C143657j(this, (C63088z) null, new C143628e(messageLite));
        jVar.f389472n = adVar;
        return jVar;
    }

    /* renamed from: h */
    public final void mo119001h(C143632i iVar) {
        this.f389486m.add(0, iVar);
    }

    /* renamed from: k */
    public final boolean mo119002k() {
        return this.f389484k.equals(C143624ae.f389412f);
    }

    public C143658k(Context context, String str, String str2, EnumSet enumSet, C143659l lVar, C143621ab abVar) {
        this.f389486m = new CopyOnWriteArrayList();
        this.f389489p = 1;
        m233378j(enumSet, str2);
        this.f389482i = context.getApplicationContext();
        this.f389483j = context.getPackageName();
        this.f389487n = str;
        this.f389488o = str2;
        this.f389484k = enumSet;
        this.f389481h = lVar;
        this.f389489p = 1;
        this.f389485l = abVar;
    }
}
