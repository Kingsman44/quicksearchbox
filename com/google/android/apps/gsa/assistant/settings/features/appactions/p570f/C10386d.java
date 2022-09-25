package com.google.android.apps.gsa.assistant.settings.features.appactions.p570f;

import android.content.res.Resources;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10258c;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10259d;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10260e;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10261f;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import java.util.List;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.f.d */
/* compiled from: PG */
public final /* synthetic */ class C10386d implements Function {

    /* renamed from: a */
    public final /* synthetic */ Resources f35091a;

    public /* synthetic */ C10386d(Resources resources) {
        this.f35091a = resources;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str;
        Resources resources = this.f35091a;
        Map.Entry entry = (Map.Entry) obj;
        C10258c cVar = (C10258c) C10261f.f34784d.createBuilder();
        C49838aw awVar = (C49838aw) entry.getKey();
        cVar.copyOnWrite();
        C10261f fVar = (C10261f) cVar.instance;
        awVar.getClass();
        fVar.f34787b = awVar;
        fVar.f34786a |= 1;
        C10259d dVar = (C10259d) C10260e.f34780c.createBuilder();
        List list = (List) entry.getValue();
        if (list.isEmpty() || ((C49826ak) list.get(0)).f129465b.isEmpty()) {
            str = BuildConfig.FLAVOR;
        } else {
            C49826ak akVar = (C49826ak) list.get(0);
            if (list.size() == 1) {
                str = resources.getString(R.string.app_entry_shortcut_quote, new Object[]{(String) akVar.f129465b.get(0)});
            } else {
                str = resources.getString(R.string.app_entry_shortcut_quote_plus_more, new Object[]{(String) akVar.f129465b.get(0), Integer.valueOf(list.size() - 1)});
            }
        }
        dVar.copyOnWrite();
        C10260e eVar = (C10260e) dVar.instance;
        str.getClass();
        eVar.f34782a |= 1;
        eVar.f34783b = str;
        C10260e eVar2 = (C10260e) dVar.build();
        cVar.copyOnWrite();
        C10261f fVar2 = (C10261f) cVar.instance;
        eVar2.getClass();
        fVar2.f34788c = eVar2;
        fVar2.f34786a |= 2;
        return (C10261f) cVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
