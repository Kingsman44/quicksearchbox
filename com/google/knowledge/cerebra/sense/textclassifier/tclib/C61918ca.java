package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.text.TextUtils;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.ca */
/* compiled from: PG */
final class C61918ca implements C61901bk {

    /* renamed from: a */
    private final C58485gu f167392a;

    public C61918ca(C58485gu guVar) {
        this.f167392a = guVar;
    }

    /* renamed from: a */
    public final C58833ax mo58336a() {
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final String mo58337b(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        C58485gu guVar = this.f167392a;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Locale) guVar.get(i)).getLanguage());
        }
        return TextUtils.join(",", arrayList);
    }
}
