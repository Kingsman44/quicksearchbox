package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71708ap;

/* renamed from: kotlinx.coroutines.db */
/* compiled from: PG */
public final class C71666db {

    /* renamed from: a */
    public static final C71708ap f191119a = new C71708ap("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C71708ap f191120b = new C71708ap("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    public static final C71708ap f191121c = new C71708ap("COMPLETING_RETRY");

    /* renamed from: d */
    public static final C71708ap f191122d = new C71708ap("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    public static final C71708ap f191123e = new C71708ap("SEALED");

    /* renamed from: f */
    public static final C71618bs f191124f = new C71618bs(false);

    /* renamed from: g */
    public static final C71618bs f191125g = new C71618bs(true);

    /* renamed from: a */
    public static final Object m104741a(Object obj) {
        return obj instanceof C71636ci ? new C71637cj((C71636ci) obj) : obj;
    }

    /* renamed from: b */
    public static final Object m104742b(Object obj) {
        C71636ci ciVar;
        C71637cj cjVar = obj instanceof C71637cj ? (C71637cj) obj : null;
        return (cjVar == null || (ciVar = cjVar.f191077a) == null) ? obj : ciVar;
    }
}
