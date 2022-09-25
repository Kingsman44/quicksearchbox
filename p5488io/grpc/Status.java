package p5488io.grpc;

import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import com.google.common.base.C58887cx;
import com.google.common.base.C58913w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* renamed from: io.grpc.Status */
/* compiled from: PG */
public final class Status {

    /* renamed from: OK */
    public static final Status f186902OK = Code.OK.mo61684b();

    /* renamed from: a */
    public static final List f186903a;

    /* renamed from: b */
    public static final Status f186904b = Code.CANCELLED.mo61684b();

    /* renamed from: c */
    public static final Status f186905c = Code.UNKNOWN.mo61684b();

    /* renamed from: d */
    public static final Status f186906d = Code.INVALID_ARGUMENT.mo61684b();

    /* renamed from: e */
    public static final Status f186907e = Code.DEADLINE_EXCEEDED.mo61684b();

    /* renamed from: f */
    public static final Status f186908f = Code.NOT_FOUND.mo61684b();

    /* renamed from: g */
    public static final Status f186909g = Code.PERMISSION_DENIED.mo61684b();

    /* renamed from: h */
    public static final Status f186910h = Code.UNAUTHENTICATED.mo61684b();

    /* renamed from: i */
    public static final Status f186911i = Code.RESOURCE_EXHAUSTED.mo61684b();

    /* renamed from: j */
    public static final Status f186912j = Code.FAILED_PRECONDITION.mo61684b();

    /* renamed from: k */
    public static final Status f186913k = Code.ABORTED.mo61684b();

    /* renamed from: l */
    public static final Status f186914l = Code.UNIMPLEMENTED.mo61684b();

    /* renamed from: m */
    public static final Status f186915m = Code.INTERNAL.mo61684b();

    /* renamed from: n */
    public static final Status f186916n = Code.UNAVAILABLE.mo61684b();

    /* renamed from: o */
    static final C70297cz f186917o = C70297cz.m102497e("grpc-status", false, new C70720ey());

    /* renamed from: p */
    static final C70297cz f186918p;

    /* renamed from: r */
    private static final C70333dd f186919r;

    /* renamed from: q */
    public final Throwable f186920q;

    /* renamed from: s */
    private final Code f186921s;

    /* renamed from: t */
    private final String f186922t;

    /* renamed from: io.grpc.Status$Code */
    /* compiled from: PG */
    public enum Code {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        

        /* renamed from: r */
        public final byte[] f186941r;

        /* renamed from: t */
        private final int f186942t;

        private Code(int i) {
            this.f186942t = i;
            this.f186941r = Integer.toString(i).getBytes(C58913w.f156752a);
        }

        /* renamed from: a */
        public static Code m102105a(String str) {
            return (Code) Enum.valueOf(Code.class, str);
        }

        /* renamed from: b */
        public final Status mo61684b() {
            return (Status) Status.f186903a.get(this.f186942t);
        }

        public int value() {
            return this.f186942t;
        }
    }

    static {
        Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
        TreeMap treeMap = new TreeMap();
        Code[] values = Code.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            Code code = values[i];
            Status status = (Status) treeMap.put(Integer.valueOf(code.value()), new Status(code, (String) null, (Throwable) null));
            if (status == null) {
                i++;
            } else {
                throw new IllegalStateException("Code value duplication between " + status.getCode().name() + " & " + code.name());
            }
        }
        f186903a = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        Code.ALREADY_EXISTS.mo61684b();
        Code.OUT_OF_RANGE.mo61684b();
        Code.DATA_LOSS.mo61684b();
        C70721ez ezVar = new C70721ez();
        f186919r = ezVar;
        f186918p = C70297cz.m102497e("grpc-message", false, ezVar);
    }

    private Status(Code code, String str, Throwable th) {
        C58838bb.m90866a(code, "code");
        this.f186921s = code;
        this.f186922t = str;
        this.f186920q = th;
    }

    /* renamed from: a */
    public static C70334de m102098a(Throwable th) {
        C58838bb.m90866a(th, C42181t.f110467a);
        while (th != null) {
            if (th instanceof StatusException) {
                return ((StatusException) th).f186944b;
            }
            if (th instanceof C70761fa) {
                return ((C70761fa) th).f188572b;
            }
            th = th.getCause();
        }
        return null;
    }

    /* renamed from: c */
    public static Status m102099c(Code code) {
        return code.mo61684b();
    }

    /* renamed from: d */
    public static Status m102100d(Throwable th) {
        C58838bb.m90866a(th, C42181t.f110467a);
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof StatusException) {
                return ((StatusException) th2).f186943a;
            }
            if (th2 instanceof C70761fa) {
                return ((C70761fa) th2).f188571a;
            }
        }
        return f186905c.mo61678e(th);
    }

    /* renamed from: f */
    static String m102101f(Status status) {
        if (status.f186922t == null) {
            return status.f186921s.toString();
        }
        return status.f186921s + ": " + status.f186922t;
    }

    public static Status fromCodeValue(int i) {
        if (i >= 0) {
            List list = f186903a;
            if (i <= list.size()) {
                return (Status) list.get(i);
            }
        }
        Status status = f186905c;
        return status.withDescription("Unknown code " + i);
    }

    public StatusException asException() {
        return new StatusException(this, (C70334de) null);
    }

    /* renamed from: b */
    public final Status mo61677b(String str) {
        if (str == null) {
            return this;
        }
        if (this.f186922t == null) {
            return new Status(this.f186921s, str, this.f186920q);
        }
        Code code = this.f186921s;
        return new Status(code, this.f186922t + "\n" + str, this.f186920q);
    }

    /* renamed from: e */
    public final Status mo61678e(Throwable th) {
        if (C58832aw.m90831a(this.f186920q, th)) {
            return this;
        }
        return new Status(this.f186921s, this.f186922t, th);
    }

    /* renamed from: g */
    public final boolean mo61679g() {
        return Code.OK == this.f186921s;
    }

    public Code getCode() {
        return this.f186921s;
    }

    public String getDescription() {
        return this.f186922t;
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("code", this.f186921s.name());
        b.mo56102b("description", this.f186922t);
        Throwable th = this.f186920q;
        Object obj = th;
        if (th != null) {
            obj = C58887cx.m90975b(th);
        }
        b.mo56102b("cause", obj);
        return b.toString();
    }

    public Status withDescription(String str) {
        if (C58832aw.m90831a(this.f186922t, str)) {
            return this;
        }
        return new Status(this.f186921s, str, this.f186920q);
    }
}
