package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C143919bh;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.g */
/* compiled from: PG */
final class C145382g {

    /* renamed from: A */
    private long f393013A;

    /* renamed from: B */
    private List f393014B;

    /* renamed from: C */
    private String f393015C;

    /* renamed from: D */
    private long f393016D;

    /* renamed from: E */
    private long f393017E;

    /* renamed from: a */
    public final C145361ff f393018a;

    /* renamed from: b */
    public Boolean f393019b;

    /* renamed from: c */
    public long f393020c;

    /* renamed from: d */
    public long f393021d;

    /* renamed from: e */
    public long f393022e;

    /* renamed from: f */
    public long f393023f;

    /* renamed from: g */
    public long f393024g;

    /* renamed from: h */
    public long f393025h;

    /* renamed from: i */
    public String f393026i;

    /* renamed from: j */
    public boolean f393027j;

    /* renamed from: k */
    private final String f393028k;

    /* renamed from: l */
    private String f393029l;

    /* renamed from: m */
    private String f393030m;

    /* renamed from: n */
    private String f393031n;

    /* renamed from: o */
    private String f393032o;

    /* renamed from: p */
    private long f393033p;

    /* renamed from: q */
    private long f393034q;

    /* renamed from: r */
    private long f393035r;

    /* renamed from: s */
    private String f393036s;

    /* renamed from: t */
    private long f393037t;

    /* renamed from: u */
    private String f393038u;

    /* renamed from: v */
    private long f393039v;

    /* renamed from: w */
    private long f393040w;

    /* renamed from: x */
    private boolean f393041x;

    /* renamed from: y */
    private boolean f393042y;

    /* renamed from: z */
    private String f393043z;

    public C145382g(C145361ff ffVar, String str) {
        C143919bh.m233958a(ffVar);
        C143919bh.m233969l(str);
        this.f393018a = ffVar;
        this.f393028k = str;
        ffVar.mo120966as().mo120904g();
    }

    /* renamed from: A */
    public final void mo121006A(long j) {
        this.f393018a.mo120966as().mo120904g();
        this.f393027j |= this.f393037t != j;
        this.f393037t = j;
    }

    /* renamed from: B */
    public final void mo121007B(long j) {
        this.f393018a.mo120966as().mo120904g();
        this.f393027j |= this.f393016D != j;
        this.f393016D = j;
    }

    /* renamed from: C */
    public final void mo121008C(long j) {
        this.f393018a.mo120966as().mo120904g();
        this.f393027j |= this.f393040w != j;
        this.f393040w = j;
    }

    /* renamed from: D */
    public final void mo121009D(long j) {
        this.f393018a.mo120966as().mo120904g();
        this.f393027j |= this.f393013A != j;
        this.f393013A = j;
    }

    /* renamed from: E */
    public final void mo121010E(long j) {
        this.f393018a.mo120966as().mo120904g();
        this.f393027j |= this.f393017E != j;
        this.f393017E = j;
    }

    /* renamed from: F */
    public final void mo121011F(String str) {
        this.f393018a.mo120966as().mo120904g();
        this.f393027j |= !Objects.equals(this.f393032o, str);
        this.f393032o = str;
    }

    /* renamed from: G */
    public final void mo121012G(String str) {
        this.f393018a.mo120966as().mo120904g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f393027j |= true ^ Objects.equals(this.f393030m, str);
        this.f393030m = str;
    }

    /* renamed from: H */
    public final void mo121013H(long j) {
        this.f393018a.mo120966as().mo120904g();
        this.f393027j |= this.f393039v != j;
        this.f393039v = j;
    }

    /* renamed from: I */
    public final void mo121014I(String str) {
        this.f393018a.mo120966as().mo120904g();
        this.f393027j |= !Objects.equals(this.f393026i, str);
        this.f393026i = str;
    }

    /* renamed from: J */
    public final void mo121015J(long j) {
        this.f393018a.mo120966as().mo120904g();
        this.f393027j |= this.f393035r != j;
        this.f393035r = j;
    }

    /* renamed from: K */
    public final void mo121016K(long j) {
        boolean z = true;
        C143919bh.m233959b(j >= 0);
        this.f393018a.mo120966as().mo120904g();
        boolean z2 = this.f393027j;
        if (this.f393033p == j) {
            z = false;
        }
        this.f393027j = z2 | z;
        this.f393033p = j;
    }

    /* renamed from: L */
    public final void mo121017L(long j) {
        this.f393018a.mo120966as().mo120904g();
        this.f393027j |= this.f393034q != j;
        this.f393034q = j;
    }

    /* renamed from: M */
    public final void mo121018M(boolean z) {
        this.f393018a.mo120966as().mo120904g();
        this.f393027j |= this.f393041x != z;
        this.f393041x = z;
    }

    /* renamed from: N */
    public final void mo121019N(String str) {
        this.f393018a.mo120966as().mo120904g();
        this.f393027j |= !Objects.equals(this.f393031n, str);
        this.f393031n = str;
    }

    /* renamed from: O */
    public final void mo121020O(List list) {
        this.f393018a.mo120966as().mo120904g();
        if (!Objects.equals(this.f393014B, list)) {
            this.f393027j = true;
            this.f393014B = list != null ? new ArrayList(list) : null;
        }
    }

    /* renamed from: P */
    public final void mo121021P(String str) {
        this.f393018a.mo120966as().mo120904g();
        this.f393027j |= !Objects.equals(this.f393015C, str);
        this.f393015C = str;
    }

    /* renamed from: Q */
    public final boolean mo121022Q() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393042y;
    }

    /* renamed from: R */
    public final boolean mo121023R() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393041x;
    }

    /* renamed from: S */
    public final void mo121024S() {
        this.f393018a.mo120966as().mo120904g();
    }

    /* renamed from: a */
    public final long mo121025a() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393037t;
    }

    /* renamed from: b */
    public final long mo121026b() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393016D;
    }

    /* renamed from: c */
    public final long mo121027c() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393040w;
    }

    /* renamed from: d */
    public final long mo121028d() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393013A;
    }

    /* renamed from: e */
    public final long mo121029e() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393017E;
    }

    /* renamed from: f */
    public final long mo121030f() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393039v;
    }

    /* renamed from: g */
    public final long mo121031g() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393035r;
    }

    /* renamed from: h */
    public final long mo121032h() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393033p;
    }

    /* renamed from: i */
    public final long mo121033i() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393034q;
    }

    /* renamed from: j */
    public final Boolean mo121034j() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393019b;
    }

    /* renamed from: k */
    public final String mo121035k() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393043z;
    }

    /* renamed from: l */
    public final String mo121036l() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393028k;
    }

    /* renamed from: m */
    public final String mo121037m() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393029l;
    }

    /* renamed from: n */
    public final String mo121038n() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393038u;
    }

    /* renamed from: o */
    public final String mo121039o() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393036s;
    }

    /* renamed from: p */
    public final String mo121040p() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393032o;
    }

    /* renamed from: q */
    public final String mo121041q() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393030m;
    }

    /* renamed from: r */
    public final String mo121042r() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393031n;
    }

    /* renamed from: s */
    public final String mo121043s() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393015C;
    }

    /* renamed from: t */
    public final List mo121044t() {
        this.f393018a.mo120966as().mo120904g();
        return this.f393014B;
    }

    /* renamed from: u */
    public final void mo121045u() {
        this.f393018a.mo120966as().mo120904g();
        long j = this.f393033p + 1;
        if (j > 2147483647L) {
            this.f393018a.mo120965ar().f392798f.mo120895b("Bundle index overflow. appId", C145325dx.m236116a(this.f393028k));
            j = 0;
        }
        this.f393027j = true;
        this.f393033p = j;
    }

    /* renamed from: v */
    public final void mo121046v(String str) {
        this.f393018a.mo120966as().mo120904g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f393027j |= true ^ Objects.equals(this.f393043z, str);
        this.f393043z = str;
    }

    /* renamed from: w */
    public final void mo121047w(boolean z) {
        this.f393018a.mo120966as().mo120904g();
        this.f393027j |= this.f393042y != z;
        this.f393042y = z;
    }

    /* renamed from: x */
    public final void mo121048x(String str) {
        this.f393018a.mo120966as().mo120904g();
        this.f393027j |= !Objects.equals(this.f393029l, str);
        this.f393029l = str;
    }

    /* renamed from: y */
    public final void mo121049y(String str) {
        this.f393018a.mo120966as().mo120904g();
        this.f393027j |= !Objects.equals(this.f393038u, str);
        this.f393038u = str;
    }

    /* renamed from: z */
    public final void mo121050z(String str) {
        this.f393018a.mo120966as().mo120904g();
        this.f393027j |= !Objects.equals(this.f393036s, str);
        this.f393036s = str;
    }
}
