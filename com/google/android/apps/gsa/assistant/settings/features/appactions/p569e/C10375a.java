package com.google.android.apps.gsa.assistant.settings.features.appactions.p569e;

import android.content.Context;
import android.support.p031v4.app.C0167am;
import android.support.p033v7.app.C0392m;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.gsa.assistant.settings.features.appactions.C10196ab;
import com.google.android.apps.gsa.assistant.settings.features.appactions.C10199ae;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10313a;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10325al;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.DataType$UpdateResult;
import com.google.android.apps.gsa.assistant.shared.appactions.c.j;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.material.textfield.TextInputEditText;
import com.google.assistant.p3861at.C49823ah;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49866bx;
import com.google.assistant.p3861at.C49867by;
import com.google.assistant.p3861at.C50382v;
import com.google.assistant.p3861at.C50409w;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.e.a */
/* compiled from: PG */
public final class C10375a extends j {

    /* renamed from: e */
    private final C10325al f35073e;

    /* renamed from: f */
    private final InputMethodManager f35074f;

    /* renamed from: g */
    private final String f35075g;

    /* renamed from: h */
    private final C10196ab f35076h;

    public C10375a(C0167am amVar, Context context, C10325al alVar, C22871g gVar, InputMethodManager inputMethodManager, String str, C90021c cVar, C10196ab abVar) {
        super(amVar, context, gVar, cVar);
        this.f35073e = alVar;
        this.f35074f = inputMethodManager;
        this.f35075g = str;
        this.f35076h = abVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C60870cx mo18454a(String str) {
        C10325al alVar = this.f35073e;
        C49866bx bxVar = (C49866bx) C49867by.f129584c.createBuilder();
        bxVar.copyOnWrite();
        C49867by byVar = (C49867by) bxVar.instance;
        str.getClass();
        byVar.f129586a |= 1;
        byVar.f129587b = str;
        C49867by byVar2 = (C49867by) bxVar.build();
        acu acu = (acu) acv.f128920X.createBuilder();
        C50382v vVar = (C50382v) C50409w.f131206c.createBuilder();
        vVar.copyOnWrite();
        C50409w wVar = (C50409w) vVar.instance;
        byVar2.getClass();
        wVar.f131209b = byVar2;
        wVar.f131208a = 5;
        C50409w wVar2 = (C50409w) vVar.build();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        wVar2.getClass();
        acv.f128937P = wVar2;
        acv.f128947c |= 1;
        return alVar.mo18426h(alVar.f34992g.mo28209i(alVar.f34987b.mo17840e(acu, TimeUnit.SECONDS), "Transform validation result.", C10313a.f34959a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo18455b() {
        return this.f35075g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo18456c() {
        this.f35074f.hideSoftInputFromWindow(((View) this.c.get()).findViewById(R.id.shortcut_phrase_input).getWindowToken(), 0);
        C10375a.super.c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo18457d(Object obj, String str) {
        DataType$UpdateResult dataType$UpdateResult = (DataType$UpdateResult) obj;
        TextInputEditText textInputEditText = (TextInputEditText) ((View) this.c.get()).findViewById(R.id.shortcut_phrase_input);
        Editable text = textInputEditText.getText();
        text.getClass();
        String obj2 = text.toString();
        if (dataType$UpdateResult.mo18410a() == 0) {
            C10199ae aeVar = this.f35076h.f34620a;
            aeVar.f34624b.findViewById(R.id.chat_bubble_dialog_layout).i(obj2);
            C49823ah ahVar = (C49823ah) aeVar.f34644v.toBuilder();
            ahVar.copyOnWrite();
            ((C49826ak) ahVar.instance).f129465b = C62942bv.emptyProtobufList();
            ahVar.mo53361a(obj2);
            aeVar.f34644v = (C49826ak) ahVar.build();
            this.f35074f.hideSoftInputFromWindow(textInputEditText.getWindowToken(), 0);
            ((C0392m) this.d.get()).dismiss();
            return;
        }
        h(dataType$UpdateResult.mo18412c());
    }

    /* renamed from: e */
    public final void mo18458e() {
        this.f35074f.toggleSoftInput(2, 1);
        C10375a.super.e();
    }
}
