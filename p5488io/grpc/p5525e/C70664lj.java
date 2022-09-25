package p5488io.grpc.p5525e;

import com.google.common.base.C58893dc;
import com.google.common.base.C58894dd;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.lj */
/* compiled from: PG */
public final class C70664lj {
    private C70664lj() {
    }

    /* renamed from: a */
    public static Set m103306a(Map map, String str) {
        Status.Code code;
        List e = C70495fc.m102944e(map, str);
        if (e == null) {
            return null;
        }
        EnumSet<E> noneOf = EnumSet.noneOf(Status.Code.class);
        for (Object next : e) {
            if (next instanceof Double) {
                Double d = (Double) next;
                int intValue = d.intValue();
                boolean z = true;
                C58893dc.m90998c(((double) intValue) == d.doubleValue(), "Status code %s is not integral", next);
                code = Status.fromCodeValue(intValue).getCode();
                if (code.value() != d.intValue()) {
                    z = false;
                }
                C58893dc.m90998c(z, "Status code %s is not valid", next);
            } else if (next instanceof String) {
                try {
                    code = Status.Code.m102105a((String) next);
                } catch (IllegalArgumentException e2) {
                    throw new C58894dd("Status code " + next + " is not valid", e2);
                }
            } else {
                throw new C58894dd("Can not convert status code " + next + " to Status.Code, because its type is " + next.getClass());
            }
            noneOf.add(code);
        }
        return Collections.unmodifiableSet(noneOf);
    }
}
