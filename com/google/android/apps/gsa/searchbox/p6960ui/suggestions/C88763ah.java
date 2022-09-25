package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.content.Context;
import com.google.android.libraries.searchbox.shared.p3202c.C41644b;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.ah */
/* compiled from: PG */
public final class C88763ah extends C88843w {
    public C88763ah(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final C88788v mo82339a() {
        return new C88762ag(this.f240540b);
    }

    /* renamed from: b */
    public final boolean mo82340b(int i) {
        if (C88844x.f240541a.contains(Integer.valueOf(i))) {
            return true;
        }
        if (i != C41669ai.f108970s.intValue()) {
            C41644b[] bVarArr = C88844x.f240542b;
            int length = bVarArr.length;
            for (int i2 = 0; i2 < 4; i2++) {
                if (bVarArr[i2].mo44240a(i)) {
                    return true;
                }
            }
        }
        return false;
    }
}
