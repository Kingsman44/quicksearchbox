package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.p6160a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80735dj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80736dk;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80748dw;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80750dy;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80800fu;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6417x.C83344ae;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.c.a.m */
/* compiled from: PG */
public final /* synthetic */ class C78210m implements C83344ae {

    /* renamed from: a */
    public final /* synthetic */ C81515c f215338a;

    public /* synthetic */ C78210m(C81515c cVar) {
        this.f215338a = cVar;
    }

    /* renamed from: a */
    public final Object mo73140a(Object obj, Object obj2, Object obj3, Object obj4) {
        C81515c cVar = this.f215338a;
        Locale locale = (Locale) obj;
        Boolean bool = (Boolean) obj3;
        Boolean bool2 = (Boolean) obj4;
        if (!((Boolean) obj2).booleanValue()) {
            return C80750dy.f221646i;
        }
        if (bool.booleanValue()) {
            C80748dw dwVar = (C80748dw) C80750dy.f221646i.createBuilder();
            C80735dj djVar = (C80735dj) C80736dk.f221621c.createBuilder();
            djVar.copyOnWrite();
            ((C80736dk) djVar.instance).f221624b = R.drawable.dora_blue_lightbulb_default;
            dwVar.copyOnWrite();
            C80736dk dkVar = (C80736dk) djVar.build();
            dkVar.getClass();
            ((C80750dy) dwVar.instance).f221650c = dkVar;
            C80800fu fuVar = C80800fu.f221721a;
            dwVar.copyOnWrite();
            C80750dy dyVar = (C80750dy) dwVar.instance;
            fuVar.getClass();
            dyVar.f221649b = fuVar;
            dyVar.f221648a = 7;
            dwVar.copyOnWrite();
            ((C80750dy) dwVar.instance).f221651d = 92646;
            String string = cVar.mo75121a(locale).getString(R.string.nga_assist_zero_state_icon_label, new Object[0]);
            dwVar.copyOnWrite();
            string.getClass();
            ((C80750dy) dwVar.instance).f221654g = string;
            dwVar.copyOnWrite();
            ((C80750dy) dwVar.instance).f221652e = false;
            return (C80750dy) dwVar.build();
        }
        C80748dw dwVar2 = (C80748dw) C80750dy.f221646i.createBuilder();
        C80735dj djVar2 = (C80735dj) C80736dk.f221621c.createBuilder();
        djVar2.copyOnWrite();
        ((C80736dk) djVar2.instance).f221624b = R.drawable.nga_assist_ic_zero_state;
        dwVar2.copyOnWrite();
        C80736dk dkVar2 = (C80736dk) djVar2.build();
        dkVar2.getClass();
        ((C80750dy) dwVar2.instance).f221650c = dkVar2;
        C80800fu fuVar2 = C80800fu.f221721a;
        dwVar2.copyOnWrite();
        C80750dy dyVar2 = (C80750dy) dwVar2.instance;
        fuVar2.getClass();
        dyVar2.f221649b = fuVar2;
        dyVar2.f221648a = 7;
        dwVar2.copyOnWrite();
        ((C80750dy) dwVar2.instance).f221651d = 92646;
        String string2 = cVar.mo75121a(locale).getString(R.string.nga_assist_zero_state_icon_label, new Object[0]);
        dwVar2.copyOnWrite();
        string2.getClass();
        ((C80750dy) dwVar2.instance).f221654g = string2;
        boolean booleanValue = bool2.booleanValue();
        dwVar2.copyOnWrite();
        ((C80750dy) dwVar2.instance).f221652e = booleanValue;
        return (C80750dy) dwVar2.build();
    }
}
