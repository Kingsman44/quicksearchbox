package org.p5633c.p5634a.p5636b;

import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.p5639e.C72245b;
import org.p5633c.p5634a.p5639e.C72267x;

/* renamed from: org.c.a.b.ag */
/* compiled from: PG */
final class C72161ag extends IllegalArgumentException {
    private static final long serialVersionUID = -5924689995607498581L;

    /* renamed from: a */
    final /* synthetic */ C72162ah f192027a;

    /* renamed from: b */
    private final boolean f192028b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72161ag(C72162ah ahVar, String str, boolean z) {
        super(str);
        this.f192027a = ahVar;
        this.f192028b = z;
    }

    public final String getMessage() {
        StringBuffer stringBuffer = new StringBuffer(85);
        stringBuffer.append("The");
        String message = super.getMessage();
        if (message != null) {
            stringBuffer.append(' ');
            stringBuffer.append(message);
        }
        stringBuffer.append(" instant is ");
        C72245b f = C72267x.f192324e.mo63600f(this.f192027a.f192053a);
        if (this.f192028b) {
            stringBuffer.append("below the supported minimum of ");
            f.mo63603i(stringBuffer, this.f192027a.f192029E.f191962a, (C72132a) null);
        } else {
            stringBuffer.append("above the supported maximum of ");
            f.mo63603i(stringBuffer, this.f192027a.f192030F.f191962a, (C72132a) null);
        }
        stringBuffer.append(" (");
        stringBuffer.append(this.f192027a.f192053a);
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public final String toString() {
        return "IllegalArgumentException: ".concat(getMessage());
    }
}
