package p5488io.grpc.p5525e;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import com.google.common.base.C58893dc;
import com.google.common.p4535g.C59203do;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import p5488io.grpc.C70846h;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.hf */
/* compiled from: PG */
final class C70552hf {

    /* renamed from: a */
    static final C70846h f188067a = new C70846h("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", (Object) null);

    /* renamed from: b */
    final Long f188068b;

    /* renamed from: c */
    final Boolean f188069c;

    /* renamed from: d */
    final Integer f188070d;

    /* renamed from: e */
    final Integer f188071e;

    /* renamed from: f */
    final C70626jz f188072f;

    /* renamed from: g */
    final C70461dw f188073g;

    public C70552hf(Map map, boolean z) {
        C70626jz jzVar;
        C70461dw dwVar;
        Map map2 = map;
        this.f188068b = C70495fc.m102942c(map2, "timeout");
        this.f188069c = C70495fc.m102949j(map);
        Integer b = C70495fc.m102941b(map2, "maxResponseMessageBytes");
        this.f188070d = b;
        if (b != null) {
            C58838bb.m90873h(b.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", b);
        }
        Integer b2 = C70495fc.m102941b(map2, "maxRequestMessageBytes");
        this.f188071e = b2;
        if (b2 != null) {
            C58838bb.m90873h(b2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", b2);
        }
        Map h = z ? C70495fc.m102947h(map2, "retryPolicy") : null;
        if (h == null) {
            jzVar = null;
        } else {
            Integer b3 = C70495fc.m102941b(h, "maxAttempts");
            C58838bb.m90866a(b3, "maxAttempts cannot be empty");
            int intValue = b3.intValue();
            C58838bb.m90871f(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, 5);
            Long c = C70495fc.m102942c(h, "initialBackoff");
            C58838bb.m90866a(c, "initialBackoff cannot be empty");
            long longValue = c.longValue();
            C58838bb.m90872g(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            Long c2 = C70495fc.m102942c(h, "maxBackoff");
            C58838bb.m90866a(c2, "maxBackoff cannot be empty");
            long longValue2 = c2.longValue();
            C58838bb.m90872g(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            Double a = C70495fc.m102940a(h, "backoffMultiplier");
            C58838bb.m90866a(a, "backoffMultiplier cannot be empty");
            double doubleValue = a.doubleValue();
            C58838bb.m90873h(doubleValue > C59203do.f157270a, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            Long c3 = C70495fc.m102942c(h, "perAttemptRecvTimeout");
            C58838bb.m90873h(c3 == null || c3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", c3);
            Set a2 = C70664lj.m103306a(h, "retryableStatusCodes");
            C58893dc.m90998c(a2 != null, "%s is required in retry policy", "retryableStatusCodes");
            C58893dc.m90998c(!a2.contains(Status.Code.OK), "%s must not contain OK", "retryableStatusCodes");
            C58838bb.m90869d(c3 != null || !a2.isEmpty(), "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            jzVar = new C70626jz(min, longValue, longValue2, doubleValue, c3, a2);
        }
        this.f188072f = jzVar;
        Map h2 = z ? C70495fc.m102947h(map2, "hedgingPolicy") : null;
        if (h2 == null) {
            dwVar = null;
        } else {
            Integer b4 = C70495fc.m102941b(h2, "maxAttempts");
            C58838bb.m90866a(b4, "maxAttempts cannot be empty");
            int intValue2 = b4.intValue();
            C58838bb.m90871f(intValue2 >= 2, "maxAttempts must be greater than 1: %s", intValue2);
            int min2 = Math.min(intValue2, 5);
            Long c4 = C70495fc.m102942c(h2, "hedgingDelay");
            C58838bb.m90866a(c4, "hedgingDelay cannot be empty");
            long longValue3 = c4.longValue();
            C58838bb.m90872g(longValue3 >= 0, "hedgingDelay must not be negative: %s", longValue3);
            Set<T> a3 = C70664lj.m103306a(h2, "nonFatalStatusCodes");
            if (a3 == null) {
                a3 = Collections.unmodifiableSet(EnumSet.noneOf(Status.Code.class));
            } else {
                C58893dc.m90998c(!a3.contains(Status.Code.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            dwVar = new C70461dw(min2, longValue3, a3);
        }
        this.f188073g = dwVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C70552hf)) {
            return false;
        }
        C70552hf hfVar = (C70552hf) obj;
        if (!C58832aw.m90831a(this.f188068b, hfVar.f188068b) || !C58832aw.m90831a(this.f188069c, hfVar.f188069c) || !C58832aw.m90831a(this.f188070d, hfVar.f188070d) || !C58832aw.m90831a(this.f188071e, hfVar.f188071e) || !C58832aw.m90831a(this.f188072f, hfVar.f188072f) || !C58832aw.m90831a(this.f188073g, hfVar.f188073g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f188068b, this.f188069c, this.f188070d, this.f188071e, this.f188072f, this.f188073g});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("timeoutNanos", this.f188068b);
        b.mo56102b("waitForReady", this.f188069c);
        b.mo56102b("maxInboundMessageSize", this.f188070d);
        b.mo56102b("maxOutboundMessageSize", this.f188071e);
        b.mo56102b("retryPolicy", this.f188072f);
        b.mo56102b("hedgingPolicy", this.f188073g);
        return b.toString();
    }
}
