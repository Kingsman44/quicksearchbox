package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f;

import android.support.p031v4.app.Fragment;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129163d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3917i.p3918a.C51387fv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.p3926e.C51999gy;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.util.Iterator;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.f.s */
/* compiled from: PG */
public final /* synthetic */ class C129258s implements Function {

    /* renamed from: a */
    public final /* synthetic */ C129259t f355040a;

    /* renamed from: b */
    public final /* synthetic */ C51809dy f355041b;

    public /* synthetic */ C129258s(C129259t tVar, C51809dy dyVar) {
        this.f355040a = tVar;
        this.f355041b = dyVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }

    public final Object apply(Object obj) {
        Optional empty;
        TextView textView;
        C129259t tVar = this.f355040a;
        C51809dy dyVar = this.f355041b;
        C52003hb hbVar = (C52003hb) obj;
        int a = C51999gy.m86464a(hbVar.f136484g);
        if (a != 0 && a == 2) {
            Fragment a2 = tVar.f355044b.mo109535a("TEXT_CONTENT_FRAGMENT_TAG");
            if (a2 instanceof C129244g) {
                C129252o j = ((C129244g) a2).mo17754z();
                String str = hbVar.f136479b;
                if (!TextUtils.isEmpty(str) && (textView = (TextView) j.f355026b.requireView().findViewById(R.id.assistant_google_bubble_text)) != null) {
                    textView.setText(str);
                }
                return C129228e.f354974b;
            }
        }
        C129245h hVar = (C129245h) C129246i.f355015d.createBuilder();
        hVar.copyOnWrite();
        C129246i iVar = (C129246i) hVar.instance;
        hbVar.getClass();
        iVar.f355018b = hbVar;
        iVar.f355017a |= 1;
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        Iterator it = dwVar.f135932a.iterator();
        while (true) {
            if (!it.hasNext()) {
                empty = Optional.empty();
                break;
            }
            C52232kc kcVar = (C52232kc) it.next();
            if ("show_drl_visual_treatment_args".equals(kcVar.f137065b)) {
                try {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    empty = Optional.m71637of((C51387fv) C62942bv.parseFrom((C62942bv) C51387fv.f133828e, kaVar.f137061c, C62921ba.m95368a()));
                } catch (Exception unused) {
                    empty = Optional.empty();
                }
            }
        }
        if (empty.isPresent()) {
            C51387fv fvVar = (C51387fv) empty.get();
            hVar.copyOnWrite();
            C129246i iVar2 = (C129246i) hVar.instance;
            fvVar.getClass();
            iVar2.f355019c = fvVar;
            iVar2.f355017a |= 2;
        }
        C129244g f = C129244g.m211012f(tVar.f355043a, (C129246i) hVar.build());
        C129228e eVar = C129228e.f354973a;
        return C129163d.m210837a(f, "TEXT_CONTENT_FRAGMENT_TAG");
    }
}
