package com.google.android.libraries.logging.p2182b.p2183a.p2184a;

import com.google.android.gms.clearcut.C143623ad;
import com.google.common.p4552o.C60321oe;
import com.google.protobuf.MessageLite;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.logging.b.a.a.b */
/* compiled from: PG */
final class C28263b extends C28265d {

    /* renamed from: a */
    private final String f76924a;

    /* renamed from: b */
    private final MessageLite f76925b;

    /* renamed from: c */
    private final C60321oe f76926c;

    /* renamed from: d */
    private final Integer f76927d;

    /* renamed from: e */
    private final C143623ad f76928e;

    /* renamed from: f */
    private final int[] f76929f;

    /* renamed from: g */
    private final int[] f76930g;

    /* renamed from: h */
    private final int f76931h;

    public C28263b(String str, MessageLite messageLite, C60321oe oeVar, Integer num, int i, C143623ad adVar, int[] iArr, int[] iArr2) {
        this.f76924a = str;
        this.f76925b = messageLite;
        this.f76926c = oeVar;
        this.f76927d = num;
        this.f76931h = i;
        this.f76928e = adVar;
        this.f76929f = iArr;
        this.f76930g = iArr2;
    }

    /* renamed from: a */
    public final C143623ad mo33758a() {
        return this.f76928e;
    }

    /* renamed from: b */
    public final C60321oe mo33759b() {
        return this.f76926c;
    }

    /* renamed from: c */
    public final MessageLite mo33760c() {
        return this.f76925b;
    }

    /* renamed from: d */
    public final Integer mo33761d() {
        return this.f76927d;
    }

    /* renamed from: e */
    public final Long mo33762e() {
        return null;
    }

    public final boolean equals(Object obj) {
        C60321oe oeVar;
        Integer num;
        C143623ad adVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28265d) {
            C28265d dVar = (C28265d) obj;
            if (this.f76924a.equals(dVar.mo33765g()) && this.f76925b.equals(dVar.mo33760c()) && ((oeVar = this.f76926c) != null ? oeVar.equals(dVar.mo33759b()) : dVar.mo33759b() == null) && ((num = this.f76927d) != null ? num.equals(dVar.mo33761d()) : dVar.mo33761d() == null) && dVar.mo33764f() == null && dVar.mo33762e() == null && this.f76931h == dVar.mo33769j() && ((adVar = this.f76928e) != null ? adVar.equals(dVar.mo33758a()) : dVar.mo33758a() == null)) {
                boolean z = dVar instanceof C28263b;
                if (Arrays.equals(this.f76929f, z ? ((C28263b) dVar).f76929f : dVar.mo33766h())) {
                    if (Arrays.equals(this.f76930g, z ? ((C28263b) dVar).f76930g : dVar.mo33768i())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final Long mo33764f() {
        return null;
    }

    /* renamed from: g */
    public final String mo33765g() {
        return this.f76924a;
    }

    /* renamed from: h */
    public final int[] mo33766h() {
        return this.f76929f;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (((this.f76924a.hashCode() ^ 1000003) * 1000003) ^ this.f76925b.hashCode()) * 1000003;
        C60321oe oeVar = this.f76926c;
        int i3 = 0;
        if (oeVar == null) {
            i = 0;
        } else {
            i = oeVar.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        Integer num = this.f76927d;
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.hashCode();
        }
        int i5 = (((i4 ^ i2) * 583896283) ^ this.f76931h) * 1000003;
        C143623ad adVar = this.f76928e;
        if (adVar != null) {
            i3 = adVar.hashCode();
        }
        return ((((i5 ^ i3) * 1000003) ^ Arrays.hashCode(this.f76929f)) * 1000003) ^ Arrays.hashCode(this.f76930g);
    }

    /* renamed from: i */
    public final int[] mo33768i() {
        return this.f76930g;
    }

    /* renamed from: j */
    public final int mo33769j() {
        return this.f76931h;
    }

    public final String toString() {
        String str = this.f76924a;
        String obj = this.f76925b.toString();
        String valueOf = String.valueOf(this.f76926c);
        Integer num = this.f76927d;
        String num2 = Integer.toString(this.f76931h - 1);
        String valueOf2 = String.valueOf(this.f76928e);
        String arrays = Arrays.toString(this.f76929f);
        String arrays2 = Arrays.toString(this.f76930g);
        return "ClearcutData{logSource=" + str + ", message=" + obj + ", visualElements=" + valueOf + ", eventCode=" + num + ", wallTime=null, elapsedTime=null, qosTier=" + num2 + ", logVerifier=" + valueOf2 + ", experimentIds=" + arrays + ", testCodes=" + arrays2 + "}";
    }
}
