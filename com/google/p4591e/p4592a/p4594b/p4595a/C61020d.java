package com.google.p4591e.p4592a.p4594b.p4595a;

import com.google.common.base.C58838bb;
import com.google.p386ak.p394d.C8385a;
import com.google.p4591e.p4592a.p4594b.C61021b;
import com.google.p4591e.p4592a.p4594b.C61029d;
import com.google.p4591e.p4592a.p4594b.C61033h;
import java.io.EOFException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.e.a.b.a.d */
/* compiled from: PG */
final class C61020d extends C61029d {

    /* renamed from: a */
    private final C8385a f165236a;

    /* renamed from: b */
    private final C61018b f165237b;

    /* renamed from: c */
    private final List f165238c = new ArrayList();

    /* renamed from: d */
    private C61033h f165239d;

    /* renamed from: e */
    private String f165240e;

    public C61020d(C61018b bVar, C8385a aVar) {
        this.f165237b = bVar;
        this.f165236a = aVar;
        aVar.f29216a = true;
    }

    /* renamed from: q */
    private final void m93297q() {
        boolean z = true;
        if (!(this.f165239d == C61033h.VALUE_NUMBER_INT || this.f165239d == C61033h.VALUE_NUMBER_FLOAT)) {
            z = false;
        }
        C58838bb.m90868c(z);
    }

    /* renamed from: a */
    public final byte mo57558a() {
        m93297q();
        return Byte.parseByte(this.f165240e);
    }

    /* renamed from: b */
    public final double mo57559b() {
        m93297q();
        return Double.parseDouble(this.f165240e);
    }

    /* renamed from: c */
    public final float mo57560c() {
        m93297q();
        return Float.parseFloat(this.f165240e);
    }

    /* renamed from: d */
    public final int mo57561d() {
        m93297q();
        return Integer.parseInt(this.f165240e);
    }

    /* renamed from: e */
    public final long mo57562e() {
        m93297q();
        return Long.parseLong(this.f165240e);
    }

    /* renamed from: f */
    public final C61021b mo57563f() {
        return this.f165237b;
    }

    /* renamed from: g */
    public final C61033h mo57564g() {
        return this.f165239d;
    }

    /* renamed from: h */
    public final C61033h mo57565h() {
        int i;
        C61033h hVar;
        if (this.f165239d != null) {
            C61033h hVar2 = C61033h.START_ARRAY;
            int ordinal = this.f165239d.ordinal();
            if (ordinal == 0) {
                this.f165236a.mo17119j();
                this.f165238c.add((Object) null);
            } else if (ordinal == 2) {
                this.f165236a.mo17120k();
                this.f165238c.add((Object) null);
            }
        }
        try {
            i = this.f165236a.mo17127r();
        } catch (EOFException unused) {
            i = 10;
        }
        C61033h hVar3 = C61033h.START_ARRAY;
        switch (i - 1) {
            case 0:
                this.f165240e = "[";
                this.f165239d = C61033h.START_ARRAY;
                break;
            case 1:
                this.f165240e = "]";
                this.f165239d = C61033h.END_ARRAY;
                List list = this.f165238c;
                list.remove(list.size() - 1);
                this.f165236a.mo17121l();
                break;
            case 2:
                this.f165240e = "{";
                this.f165239d = C61033h.START_OBJECT;
                break;
            case 3:
                this.f165240e = "}";
                this.f165239d = C61033h.END_OBJECT;
                List list2 = this.f165238c;
                list2.remove(list2.size() - 1);
                this.f165236a.mo17122m();
                break;
            case 4:
                this.f165240e = this.f165236a.mo17115f();
                this.f165239d = C61033h.FIELD_NAME;
                List list3 = this.f165238c;
                list3.set(list3.size() - 1, this.f165240e);
                break;
            case 5:
                this.f165240e = this.f165236a.mo17117h();
                this.f165239d = C61033h.VALUE_STRING;
                break;
            case 6:
                String h = this.f165236a.mo17117h();
                this.f165240e = h;
                this.f165239d = h.indexOf(46) == -1 ? C61033h.VALUE_NUMBER_INT : C61033h.VALUE_NUMBER_FLOAT;
                break;
            case 7:
                if (this.f165236a.mo17126q()) {
                    this.f165240e = "true";
                    hVar = C61033h.VALUE_TRUE;
                } else {
                    this.f165240e = "false";
                    hVar = C61033h.VALUE_FALSE;
                }
                this.f165239d = hVar;
                break;
            case 8:
                this.f165240e = "null";
                this.f165239d = C61033h.VALUE_NULL;
                this.f165236a.mo17123n();
                break;
            default:
                this.f165240e = null;
                this.f165239d = null;
                break;
        }
        return this.f165239d;
    }

    /* renamed from: i */
    public final String mo57566i() {
        if (this.f165238c.isEmpty()) {
            return null;
        }
        List list = this.f165238c;
        return (String) list.get(list.size() - 1);
    }

    /* renamed from: j */
    public final String mo57567j() {
        return this.f165240e;
    }

    /* renamed from: k */
    public final BigDecimal mo57568k() {
        m93297q();
        return new BigDecimal(this.f165240e);
    }

    /* renamed from: l */
    public final BigInteger mo57569l() {
        m93297q();
        return new BigInteger(this.f165240e);
    }

    /* renamed from: m */
    public final short mo57570m() {
        m93297q();
        return Short.parseShort(this.f165240e);
    }

    /* renamed from: n */
    public final void mo57571n() {
        this.f165236a.close();
    }

    /* renamed from: p */
    public final void mo57572p() {
        if (this.f165239d != null) {
            C61033h hVar = C61033h.START_ARRAY;
            int ordinal = this.f165239d.ordinal();
            if (ordinal == 0) {
                this.f165236a.mo17124o();
                this.f165240e = "]";
                this.f165239d = C61033h.END_ARRAY;
            } else if (ordinal == 2) {
                this.f165236a.mo17124o();
                this.f165240e = "}";
                this.f165239d = C61033h.END_OBJECT;
            }
        }
    }
}
