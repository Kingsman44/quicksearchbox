package kotlinx.coroutines.p5574b;

import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.p5574b.p5575a.C71447d;
import p5462h.p5466c.C69577g;

/* renamed from: kotlinx.coroutines.b.dh */
/* compiled from: PG */
public final class C71558dh extends C71447d {

    /* renamed from: a */
    public long f190964a = -1;

    /* renamed from: b */
    public C69577g f190965b;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo62791a(Object obj) {
        C71556df dfVar = (C71556df) obj;
        if (this.f190964a >= 0) {
            return false;
        }
        long j = dfVar.f190956b;
        if (j < dfVar.f190957c) {
            dfVar.f190957c = j;
        }
        this.f190964a = j;
        return true;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C69577g[] mo62792b(Object obj) {
        boolean z = C71600ba.f191036a;
        long j = this.f190964a;
        this.f190964a = -1;
        this.f190965b = null;
        return ((C71556df) obj).mo62812k(j);
    }
}
