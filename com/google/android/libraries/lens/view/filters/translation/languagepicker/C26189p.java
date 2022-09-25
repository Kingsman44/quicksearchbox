package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import com.google.common.base.C58817ah;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.p */
/* compiled from: PG */
public final /* synthetic */ class C26189p implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C26189p f71167a = new C26189p();

    private /* synthetic */ C26189p() {
    }

    public final Object apply(Object obj) {
        C26133ab abVar = (C26133ab) obj;
        if (abVar instanceof C26136ae) {
            C26136ae aeVar = (C26136ae) abVar;
            return Integer.valueOf(Arrays.hashCode(new Object[]{aeVar.mo31368h(), Boolean.valueOf(aeVar.mo31370j())}));
        } else if (abVar instanceof C26134ac) {
            return Integer.valueOf(((C26134ac) abVar).mo31353a());
        } else {
            if (abVar instanceof C26137af) {
                return 53170;
            }
            throw new IllegalStateException();
        }
    }
}
