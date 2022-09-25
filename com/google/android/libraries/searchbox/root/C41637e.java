package com.google.android.libraries.searchbox.root;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Comparator;

/* renamed from: com.google.android.libraries.searchbox.root.e */
/* compiled from: PG */
public final /* synthetic */ class C41637e implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C41637e f108849a = new C41637e();

    private /* synthetic */ C41637e() {
    }

    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        RootSuggestion rootSuggestion = (RootSuggestion) obj;
        RootSuggestion rootSuggestion2 = (RootSuggestion) obj2;
        C59071e eVar = RootSuggestion.f108829a;
        if (rootSuggestion.f108916q != rootSuggestion2.f108916q) {
            if (Math.min(rootSuggestion.f108916q, rootSuggestion2.f108916q) == -1) {
                ((C59052c) ((C59052c) RootSuggestion.f108829a.mo56225c()).mo56372aa(53910)).mo56354G("It is not allowed for one suggestion to have priority but the other does not. lhs=%s rhs=%s", new C41634b(rootSuggestion), new C41635c(rootSuggestion2));
            }
            i = rootSuggestion.f108916q;
            i2 = rootSuggestion2.f108916q;
        } else if (rootSuggestion.f108909j == 1) {
            if (rootSuggestion2.f108909j != 1) {
                return -1;
            }
            return 0;
        } else if (rootSuggestion2.f108909j == 1) {
            return 1;
        } else {
            int compareTo = rootSuggestion.f108915p.compareTo(rootSuggestion2.f108915p);
            if (compareTo != 0) {
                return compareTo;
            }
            boolean z = rootSuggestion.f108832d;
            if (z != rootSuggestion2.f108832d) {
                if (!z) {
                    return -1;
                }
                return 1;
            } else if (!z) {
                i = rootSuggestion.f108833e;
                i2 = rootSuggestion2.f108833e;
            } else {
                boolean z2 = rootSuggestion.f108834f;
                boolean z3 = rootSuggestion2.f108834f;
                boolean z4 = rootSuggestion.f108835g;
                if (z4 == rootSuggestion2.f108835g) {
                    return rootSuggestion2.f108917r - rootSuggestion.f108917r;
                }
                if (!z4) {
                    return -1;
                }
                return 1;
            }
        }
        return i - i2;
    }
}
