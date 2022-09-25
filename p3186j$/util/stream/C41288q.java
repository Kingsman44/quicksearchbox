package p3186j$.util.stream;

import java.util.HashSet;
import java.util.Set;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Predicate;
import p3186j$.util.function.ToDoubleFunction;
import p3186j$.util.function.ToIntFunction;

/* renamed from: j$.util.stream.q */
final class C41288q extends C41155H1 {

    /* renamed from: b */
    public final /* synthetic */ int f108002b;

    /* renamed from: c */
    Object f108003c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41288q(C41232c cVar, C41171L1 l1, int i) {
        super(l1);
        this.f108002b = i;
        this.f108003c = cVar;
    }

    public final void accept(Object obj) {
        int i = this.f108002b;
        C41171L1 l1 = this.f107737a;
        switch (i) {
            case 0:
                if (!((Set) this.f108003c).contains(obj)) {
                    ((Set) this.f108003c).add(obj);
                    l1.accept(obj);
                    return;
                }
                return;
            case 1:
                ((Consumer) ((C41181O) this.f108003c).f107775t).accept(obj);
                l1.accept(obj);
                return;
            case 2:
                if (((Predicate) ((C41181O) this.f108003c).f107775t).test(obj)) {
                    l1.accept(obj);
                    return;
                }
                return;
            case 3:
                l1.accept(((C41326z1) this.f108003c).f108051t.apply(obj));
                return;
            case 4:
                l1.accept(((ToIntFunction) ((C41185P) this.f108003c).f107781t).applyAsInt(obj));
                return;
            case 5:
                l1.accept(((C41127A1) this.f108003c).f107713s.applyAsLong(obj));
                return;
            default:
                l1.accept(((ToDoubleFunction) ((C41308v) this.f108003c).f108039t).applyAsDouble(obj));
                return;
        }
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        int i = this.f108002b;
        C41171L1 l1 = this.f107737a;
        switch (i) {
            case 0:
                this.f108003c = new HashSet();
                l1.mo43663c(-1);
                return;
            case 2:
                l1.mo43663c(-1);
                return;
            default:
                l1.mo43663c(j);
                return;
        }
    }

    public final void end() {
        switch (this.f108002b) {
            case 0:
                this.f108003c = null;
                this.f107737a.end();
                return;
            default:
                super.end();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41288q(C41171L1 l1) {
        super(l1);
        this.f108002b = 0;
    }
}
