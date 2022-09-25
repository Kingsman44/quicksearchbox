package com.google.android.libraries.gsa.conversation.clientop;

import com.google.common.base.C58833ax;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.c */
/* compiled from: PG */
public final class C22407c extends C22434e {

    /* renamed from: a */
    public final boolean f61899a;

    /* renamed from: b */
    public final byte[] f61900b;

    /* renamed from: c */
    public final C58833ax f61901c;

    /* renamed from: d */
    public final C58833ax f61902d;

    /* renamed from: e */
    public final C58833ax f61903e;

    /* renamed from: f */
    private final C58833ax f61904f;

    public C22407c(boolean z, byte[] bArr, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        this.f61899a = z;
        this.f61900b = bArr;
        this.f61901c = axVar;
        this.f61904f = axVar2;
        this.f61902d = axVar3;
        this.f61903e = axVar4;
    }

    /* renamed from: a */
    public final C58833ax mo27591a() {
        return this.f61903e;
    }

    /* renamed from: b */
    public final C58833ax mo27592b() {
        return this.f61902d;
    }

    /* renamed from: c */
    public final C58833ax mo27593c() {
        return this.f61904f;
    }

    /* renamed from: d */
    public final C58833ax mo27594d() {
        return this.f61901c;
    }

    /* renamed from: e */
    public final boolean mo27595e() {
        return this.f61899a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22434e) {
            C22434e eVar = (C22434e) obj;
            if (this.f61899a == eVar.mo27595e()) {
                return Arrays.equals(this.f61900b, eVar instanceof C22407c ? ((C22407c) eVar).f61900b : eVar.mo27597f()) && this.f61901c.equals(eVar.mo27594d()) && this.f61904f.equals(eVar.mo27593c()) && this.f61902d.equals(eVar.mo27592b()) && this.f61903e.equals(eVar.mo27591a());
            }
        }
    }

    /* renamed from: f */
    public final byte[] mo27597f() {
        return this.f61900b;
    }

    public final int hashCode() {
        return (((((((((((true != this.f61899a ? 1237 : 1231) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f61900b)) * 1000003) ^ this.f61901c.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.f61902d.hashCode()) * 1000003) ^ this.f61903e.hashCode();
    }

    public final String toString() {
        boolean z = this.f61899a;
        String arrays = Arrays.toString(this.f61900b);
        String valueOf = String.valueOf(this.f61901c);
        String valueOf2 = String.valueOf(this.f61902d);
        String valueOf3 = String.valueOf(this.f61903e);
        return "ClientOpProcessingMetadata{isFromServer=" + z + ", deviceSpecificRendering=" + arrays + ", eventId=" + valueOf + ", conversationId=Optional.absent(), clientOpResponseMetadata=" + valueOf2 + ", clientOpPerformMetadata=" + valueOf3 + "}";
    }
}
