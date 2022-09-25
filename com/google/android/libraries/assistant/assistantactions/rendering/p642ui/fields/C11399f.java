package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.assistant.p3897e.p3902c.p3907c.C51156m;
import com.google.assistant.p3897e.p3902c.p3907c.C51159p;
import com.google.assistant.p3897e.p3921j.C52469sx;
import com.google.assistant.p3897e.p3921j.C52470sy;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.f */
/* compiled from: PG */
final class C11399f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AudioRecorderField f37138a;

    public C11399f(AudioRecorderField audioRecorderField) {
        this.f37138a = audioRecorderField;
    }

    public final void onClick(View view) {
        C51159p pVar;
        AudioRecorderField audioRecorderField = this.f37138a;
        C11295c cVar = audioRecorderField.f37153l;
        if (cVar != null && audioRecorderField.f37154m != null) {
            C51941eu euVar = cVar.f36729a;
            C51937eq eqVar = (C51937eq) euVar.toBuilder();
            C51156m mVar = (C51156m) C51159p.f133168f.createBuilder();
            if (euVar.f136277e == 23) {
                pVar = (C51159p) euVar.f136278f;
            } else {
                pVar = C51159p.f133168f;
            }
            String str = pVar.f133171b;
            mVar.copyOnWrite();
            C51159p pVar2 = (C51159p) mVar.instance;
            str.getClass();
            pVar2.f133170a |= 1;
            pVar2.f133171b = str;
            mVar.copyOnWrite();
            C51159p pVar3 = (C51159p) mVar.instance;
            pVar3.f133170a |= 2;
            pVar3.f133172c = BuildConfig.FLAVOR;
            mVar.copyOnWrite();
            C51159p pVar4 = (C51159p) mVar.instance;
            pVar4.f133173d = 0;
            pVar4.f133170a |= 4;
            eqVar.copyOnWrite();
            C51941eu euVar2 = (C51941eu) eqVar.instance;
            C51159p pVar5 = (C51159p) mVar.build();
            pVar5.getClass();
            euVar2.f136278f = pVar5;
            euVar2.f136277e = 23;
            cVar.f36729a = (C51941eu) eqVar.build();
            C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
            String str2 = this.f37138a.f37153l.f36729a.f136279g;
            tpVar.copyOnWrite();
            C52490tr trVar = (C52490tr) tpVar.instance;
            str2.getClass();
            trVar.f137797a |= 1;
            trVar.f137800d = str2;
            String str3 = this.f37138a.f37153l.f36729a.f136280h;
            tpVar.copyOnWrite();
            C52490tr trVar2 = (C52490tr) tpVar.instance;
            str3.getClass();
            trVar2.f137797a |= 2;
            trVar2.f137801e = str3;
            tpVar.copyOnWrite();
            C52490tr trVar3 = (C52490tr) tpVar.instance;
            trVar3.f137797a |= 4;
            trVar3.f137802f = true;
            C52469sx sxVar = (C52469sx) C52470sy.f137736c.createBuilder();
            sxVar.copyOnWrite();
            C52470sy syVar = (C52470sy) sxVar.instance;
            syVar.f137738a |= 1;
            syVar.f137739b = BuildConfig.FLAVOR;
            C52470sy syVar2 = (C52470sy) sxVar.build();
            tpVar.copyOnWrite();
            C52490tr trVar4 = (C52490tr) tpVar.instance;
            syVar2.getClass();
            trVar4.f137799c = syVar2;
            trVar4.f137798b = 13;
            this.f37138a.f37153l.f36730b = (C52490tr) tpVar.build();
            AudioRecorderField audioRecorderField2 = this.f37138a;
            audioRecorderField2.mo19941h(audioRecorderField2.f37154m.mo19691a(audioRecorderField2.f37153l));
        }
    }
}
