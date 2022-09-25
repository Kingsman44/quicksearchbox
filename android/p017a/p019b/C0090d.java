package android.p017a.p019b;

import java.io.InvalidObjectException;
import java.text.Format;

/* renamed from: android.a.b.d */
/* compiled from: PG */
public final class C0090d extends Format.Field {

    /* renamed from: a */
    public static final C0090d f243a = new C0090d();
    private static final long serialVersionUID = 7510380454602616157L;

    protected C0090d() {
        super("message argument field");
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        if (getClass() == C0090d.class) {
            String name = getName();
            C0090d dVar = f243a;
            if (name.equals(dVar.getName())) {
                return dVar;
            }
            throw new InvalidObjectException("Unknown attribute name.");
        }
        throw new InvalidObjectException("A subclass of MessageFormat.Field must implement readResolve.");
    }
}
