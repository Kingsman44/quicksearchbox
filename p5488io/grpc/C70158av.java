package p5488io.grpc;

import com.google.common.base.C58838bb;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.grpc.av */
/* compiled from: PG */
public final class C70158av {

    /* renamed from: a */
    public static final C70163b f187010a = new C70163b("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: b */
    public final List f187011b;

    /* renamed from: c */
    public final C70256c f187012c;

    /* renamed from: d */
    private final int f187013d;

    public C70158av(List list, C70256c cVar) {
        C58838bb.m90869d(!list.isEmpty(), "addrs is empty");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f187011b = unmodifiableList;
        C58838bb.m90866a(cVar, "attrs");
        this.f187012c = cVar;
        this.f187013d = unmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C70158av)) {
            return false;
        }
        C70158av avVar = (C70158av) obj;
        if (this.f187011b.size() != avVar.f187011b.size()) {
            return false;
        }
        for (int i = 0; i < this.f187011b.size(); i++) {
            if (!((SocketAddress) this.f187011b.get(i)).equals(avVar.f187011b.get(i))) {
                return false;
            }
        }
        if (!this.f187012c.equals(avVar.f187012c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f187013d;
    }

    public final String toString() {
        return "[" + this.f187011b + "/" + this.f187012c + "]";
    }
}
