package com.google.android.libraries.assistant.auto.tng.suggestions.p1262j;

import android.content.ComponentName;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.auto.p450a.p451a.C8856aa;
import com.google.android.apps.auto.p450a.p451a.C8857ab;
import com.google.android.apps.auto.p450a.p451a.C8864ai;
import com.google.android.apps.auto.p450a.p451a.C8865aj;
import com.google.android.apps.auto.p450a.p451a.C8878aw;
import com.google.android.apps.auto.p450a.p451a.C8879ax;
import com.google.android.apps.auto.p450a.p451a.C8880ay;
import com.google.android.apps.auto.p450a.p451a.C8881az;
import com.google.android.apps.auto.p450a.p451a.C8932y;
import com.google.android.apps.auto.p450a.p451a.C8933z;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11671ab;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16344ar;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.j.h */
/* compiled from: PG */
public final /* synthetic */ class C16313h implements Function {

    /* renamed from: a */
    public final /* synthetic */ C11671ab f48001a;

    public /* synthetic */ C16313h(C11671ab abVar) {
        this.f48001a = abVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C52560wg wgVar;
        C52560wg wgVar2;
        C51016dg dgVar;
        C52560wg wgVar3;
        C51058ev evVar;
        ComponentName componentName;
        C11671ab abVar = this.f48001a;
        C53435nu nuVar = ((C16344ar) obj).f48117b;
        if (nuVar == null) {
            nuVar = C53435nu.f140233n;
        }
        C51012dc dcVar = nuVar.f140245j;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        C8864ai aiVar = (C8864ai) C8865aj.f30788h.createBuilder();
        if ((dcVar.f132815a & 2) != 0) {
            String str = dcVar.f132817c;
            aiVar.copyOnWrite();
            C8865aj ajVar = (C8865aj) aiVar.instance;
            str.getClass();
            ajVar.f30790a |= 1;
            ajVar.f30791b = str;
        }
        if ((dcVar.f132815a & 8) != 0) {
            C63088z zVar = dcVar.f132819e;
            aiVar.copyOnWrite();
            C8865aj ajVar2 = (C8865aj) aiVar.instance;
            zVar.getClass();
            ajVar2.f30790a |= 2;
            ajVar2.f30792c = zVar;
        }
        C51012dc dcVar2 = nuVar.f140245j;
        if (dcVar2 == null) {
            dcVar2 = C51012dc.f132813k;
        }
        Optional ofNullable = Optional.ofNullable(ComponentName.unflattenFromString(dcVar2.f132821g));
        if (!ofNullable.isPresent()) {
            if (nuVar.f140237b == 11) {
                wgVar3 = (C52560wg) nuVar.f140238c;
            } else {
                wgVar3 = C52560wg.f137943j;
            }
            C52567wn wnVar = C52567wn.UNKNOWN;
            C52568wo woVar = wgVar3.f137950f;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            C52567wn b = C52567wn.m86649b(woVar.f138003j);
            if (b == null) {
                b = C52567wn.UNKNOWN;
            }
            int ordinal = b.ordinal();
            if (ordinal == 9) {
                ofNullable = Optional.m71637of(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.podcasts.browser.PodcastBrowserService"));
            } else if (ordinal != 21) {
                C51098gh ghVar = wgVar3.f137949e;
                if (ghVar == null) {
                    ghVar = C51098gh.f133009e;
                }
                if (ghVar.f133012b == 1) {
                    evVar = (C51058ev) ghVar.f133013c;
                } else {
                    evVar = C51058ev.f132941o;
                }
                if ((evVar.f132943a & 1) != 0) {
                    String str2 = evVar.f132944b;
                    if (str2.equals(abVar.f37658b)) {
                        componentName = new ComponentName(abVar.f37658b, abVar.f37659c);
                    } else {
                        componentName = new ComponentName(str2, BuildConfig.FLAVOR);
                    }
                    ofNullable = Optional.m71637of(componentName);
                } else {
                    ofNullable = Optional.empty();
                }
            } else {
                ofNullable = Optional.m71637of(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.libraries.assistant.auto.tng.media.mediabrowser.NewsMediaBrowserService"));
            }
        }
        ofNullable.ifPresent(new C16320o(aiVar));
        if (nuVar.f140237b == 11) {
            wgVar = (C52560wg) nuVar.f140238c;
        } else {
            wgVar = C52560wg.f137943j;
        }
        boolean z = false;
        if (wgVar.f137951g.isEmpty()) {
            if (nuVar.f140237b == 11) {
                wgVar2 = (C52560wg) nuVar.f140238c;
            } else {
                wgVar2 = C52560wg.f137943j;
            }
            if (wgVar2.f137946b == 16) {
                dgVar = (C51016dg) wgVar2.f137947c;
            } else {
                dgVar = C51016dg.f132827g;
            }
            if ((dgVar.f132829a & 8) == 0) {
                z = true;
            }
        }
        C8856aa aaVar = (C8856aa) C8857ab.f30766e.createBuilder();
        String str3 = nuVar.f140239d;
        aaVar.copyOnWrite();
        C8857ab abVar2 = (C8857ab) aaVar.instance;
        str3.getClass();
        abVar2.f30768a |= 1;
        abVar2.f30769b = str3;
        C8878aw awVar = (C8878aw) C8879ax.f30820i.createBuilder();
        C8880ay ayVar = (C8880ay) C8881az.f30830c.createBuilder();
        ayVar.mo17270a(nuVar.f140240e);
        awVar.copyOnWrite();
        C8879ax axVar = (C8879ax) awVar.instance;
        C8881az azVar = (C8881az) ayVar.build();
        azVar.getClass();
        axVar.f30826e = azVar;
        axVar.f30822a |= 8;
        C8880ay ayVar2 = (C8880ay) C8881az.f30830c.createBuilder();
        ayVar2.mo17270a(nuVar.f140242g);
        awVar.copyOnWrite();
        C8879ax axVar2 = (C8879ax) awVar.instance;
        C8881az azVar2 = (C8881az) ayVar2.build();
        azVar2.getClass();
        axVar2.f30827f = azVar2;
        axVar2.f30822a = 16 | axVar2.f30822a;
        awVar.copyOnWrite();
        C8879ax axVar3 = (C8879ax) awVar.instance;
        C8865aj ajVar3 = (C8865aj) aiVar.build();
        ajVar3.getClass();
        axVar3.f30825d = ajVar3;
        axVar3.f30822a |= 4;
        C8932y yVar = (C8932y) C8933z.f30971e.createBuilder();
        String str4 = nuVar.f140239d;
        yVar.copyOnWrite();
        C8933z zVar2 = (C8933z) yVar.instance;
        str4.getClass();
        zVar2.f30973a = 1 | zVar2.f30973a;
        zVar2.f30974b = str4;
        yVar.copyOnWrite();
        C8933z zVar3 = (C8933z) yVar.instance;
        zVar3.f30973a |= 8;
        zVar3.f30976d = z;
        awVar.copyOnWrite();
        C8879ax axVar4 = (C8879ax) awVar.instance;
        C8933z zVar4 = (C8933z) yVar.build();
        zVar4.getClass();
        axVar4.f30828g = zVar4;
        axVar4.f30822a |= 32;
        aaVar.copyOnWrite();
        C8857ab abVar3 = (C8857ab) aaVar.instance;
        C8879ax axVar5 = (C8879ax) awVar.build();
        axVar5.getClass();
        abVar3.f30770c = axVar5;
        abVar3.f30768a |= 4;
        return (C8857ab) aaVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
