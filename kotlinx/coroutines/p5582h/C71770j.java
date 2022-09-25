package kotlinx.coroutines.p5582h;

import kotlinx.coroutines.C71601bb;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.h.j */
/* compiled from: PG */
public final class C71770j extends C71768h {

    /* renamed from: a */
    public final Runnable f191279a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71770j(Runnable runnable, long j, C71769i iVar) {
        super(j, iVar);
        C69664n.m101061g(runnable, "block");
        C69664n.m101061g(iVar, "taskContext");
        this.f191279a = runnable;
    }

    public final String toString() {
        String a = C71601bb.m104526a(this.f191279a);
        String b = C71601bb.m104527b(this.f191279a);
        long j = this.f191276g;
        C71769i iVar = this.f191277h;
        return "Task[" + a + "@" + b + ", " + j + ", " + iVar + "]";
    }

    public final void run() {
        this.f191279a.run();
    }
}
