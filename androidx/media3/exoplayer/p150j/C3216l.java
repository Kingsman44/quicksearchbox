package androidx.media3.exoplayer.p150j;

import com.google.common.p4522b.C58710pc;
import java.util.Comparator;

/* renamed from: androidx.media3.exoplayer.j.l */
/* compiled from: PG */
public final /* synthetic */ class C3216l implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C3216l f9643a = new C3216l();

    private /* synthetic */ C3216l() {
    }

    public final int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        C58710pc pcVar = C3195ab.f9596a;
        if (num.intValue() == -1) {
            if (num2.intValue() == -1) {
                return 0;
            }
            return -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }
}
