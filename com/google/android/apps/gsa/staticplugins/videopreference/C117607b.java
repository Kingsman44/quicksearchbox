package com.google.android.apps.gsa.staticplugins.videopreference;

import android.preference.Preference;
import android.preference.SwitchPreference;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60661yd;
import com.google.common.p4552o.C60662ye;
import com.google.p395al.p417d.p418a.C8590q;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.videopreference.b */
/* compiled from: PG */
final class C117607b implements Preference.OnPreferenceChangeListener {

    /* renamed from: a */
    final /* synthetic */ VideoPreferenceFragment f326473a;

    public C117607b(VideoPreferenceFragment videoPreferenceFragment) {
        this.f326473a = videoPreferenceFragment;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C8590q a = this.f326473a.mo103401a();
        ((SwitchPreference) preference).setChecked(booleanValue);
        C8590q a2 = this.f326473a.mo103401a();
        this.f326473a.mo103402b(a2);
        this.f326473a.f326466a.mo79998b(a2);
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1289;
        C60661yd ydVar = (C60661yd) C60662ye.f164563d.createBuilder();
        ydVar.copyOnWrite();
        C60662ye yeVar = (C60662ye) ydVar.instance;
        yeVar.f164566b = a.f29729e;
        yeVar.f164565a |= 1;
        ydVar.copyOnWrite();
        C60662ye yeVar2 = (C60662ye) ydVar.instance;
        yeVar2.f164567c = a2.f29729e;
        yeVar2.f164565a |= 2;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C60662ye yeVar3 = (C60662ye) ydVar.build();
        yeVar3.getClass();
        ufVar2.f164227ce = yeVar3;
        ufVar2.f164254i |= 16777216;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        VideoPreferenceFragment videoPreferenceFragment = this.f326473a;
        videoPreferenceFragment.f326467b.mo28212l("forceInvalidate", new C117606a(videoPreferenceFragment));
        return true;
    }
}
