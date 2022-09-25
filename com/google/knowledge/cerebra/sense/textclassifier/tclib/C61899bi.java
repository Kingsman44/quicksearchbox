package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.text.TextUtils;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import java.util.ArrayList;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.bi */
/* compiled from: PG */
public final /* synthetic */ class C61899bi implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C61900bj f167371a;

    /* renamed from: b */
    public final /* synthetic */ CharSequence f167372b;

    public /* synthetic */ C61899bi(C61900bj bjVar, CharSequence charSequence) {
        this.f167371a = bjVar;
        this.f167372b = charSequence;
    }

    public final Object apply(Object obj) {
        C61900bj bjVar = this.f167371a;
        CharSequence charSequence = this.f167372b;
        Float f = (Float) obj;
        if (f.floatValue() < 0.0f || f.floatValue() > 1.0f) {
            new StringBuilder("[detectLanguageTagsFromText] unexpected threshold is found: ").append(f);
            Log.w("LangIdLanguageDetector", "[detectLanguageTagsFromText] unexpected threshold is found: ".concat(String.valueOf(f)));
            return BuildConfig.FLAVOR;
        }
        C61955dk dkVar = (C61955dk) bjVar.f167373a.apply(new C61976s(charSequence));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < dkVar.mo58417a().size(); i++) {
            C58838bb.m90861B(i, dkVar.mo58417a().size(), "index");
            if (((C61953di) dkVar.mo58417a().get(i)).mo58414a() < f.floatValue()) {
                break;
            }
            arrayList.add(dkVar.mo58418b(i).getLanguage());
        }
        return TextUtils.join(",", arrayList);
    }
}
