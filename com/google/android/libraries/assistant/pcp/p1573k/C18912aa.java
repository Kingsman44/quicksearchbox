package com.google.android.libraries.assistant.pcp.p1573k;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.MediaDescriptionCompat;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123727au;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52559wf;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52563wj;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63034ez;
import com.google.protobuf.C63037fb;
import com.google.protobuf.C63060fy;
import com.google.protobuf.C63063ga;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.pcp.k.aa */
/* compiled from: PG */
public final class C18912aa {

    /* renamed from: a */
    public final C21370a f53200a;

    /* renamed from: b */
    public final Executor f53201b;

    /* renamed from: c */
    public final Executor f53202c;

    public C18912aa(C21370a aVar, Executor executor, Executor executor2) {
        this.f53200a = aVar;
        this.f53201b = executor;
        this.f53202c = executor2;
    }

    /* renamed from: a */
    public static C52559wf m36353a(ComponentName componentName, MediaBrowserCompat.MediaItem mediaItem, Map map, Map map2) {
        C52559wf wfVar = (C52559wf) C52560wg.f137943j.createBuilder();
        String g = C58837ba.m90858g(mediaItem.f930b.f932a);
        wfVar.copyOnWrite();
        C52560wg wgVar = (C52560wg) wfVar.instance;
        wgVar.f137945a |= 64;
        wgVar.f137952h = g;
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        String packageName = componentName.getPackageName();
        esVar.copyOnWrite();
        C51058ev evVar = (C51058ev) esVar.instance;
        packageName.getClass();
        evVar.f132943a |= 1;
        evVar.f132944b = packageName;
        ggVar.copyOnWrite();
        C51098gh ghVar = (C51098gh) ggVar.instance;
        C51058ev evVar2 = (C51058ev) esVar.build();
        evVar2.getClass();
        ghVar.f133013c = evVar2;
        ghVar.f133012b = 1;
        C52563wj wjVar = (C52563wj) C52568wo.f137992v.createBuilder();
        if (componentName.getClassName().equals("com.google.android.apps.search.podcasts.browser.PodcastBrowserService")) {
            C52567wn wnVar = C52567wn.PODCAST_EPISODE;
            wjVar.copyOnWrite();
            C52568wo woVar = (C52568wo) wjVar.instance;
            woVar.f138003j = wnVar.f137991y;
            woVar.f137994a |= 512;
            ggVar.copyOnWrite();
            C51098gh ghVar2 = (C51098gh) ggVar.instance;
            ghVar2.f133011a |= 1024;
            ghVar2.f133014d = "https://www.gstatic.com/images/branding/product/2x/podcasts_48dp.png";
        }
        C51098gh ghVar3 = (C51098gh) ggVar.build();
        wfVar.copyOnWrite();
        C52560wg wgVar2 = (C52560wg) wfVar.instance;
        ghVar3.getClass();
        wgVar2.f137949e = ghVar3;
        wgVar2.f137945a |= 4;
        MediaDescriptionCompat mediaDescriptionCompat = mediaItem.f930b;
        if (mediaDescriptionCompat == null) {
            C52568wo woVar2 = (C52568wo) wjVar.build();
            wfVar.copyOnWrite();
            C52560wg wgVar3 = (C52560wg) wfVar.instance;
            woVar2.getClass();
            wgVar3.f137950f = woVar2;
            wgVar3.f137945a |= 8;
            return wfVar;
        }
        CharSequence charSequence = mediaDescriptionCompat.f933b;
        if (charSequence != null) {
            String obj = charSequence.toString();
            wjVar.copyOnWrite();
            C52568wo woVar3 = (C52568wo) wjVar.instance;
            woVar3.f137994a |= 1;
            woVar3.f137998e = C58837ba.m90858g(obj);
        }
        CharSequence charSequence2 = mediaDescriptionCompat.f934c;
        if (charSequence2 != null) {
            String g2 = C58837ba.m90858g(charSequence2.toString());
            wjVar.copyOnWrite();
            C52568wo woVar4 = (C52568wo) wjVar.instance;
            C62971cq cqVar = woVar4.f138011r;
            if (!cqVar.mo58948c()) {
                woVar4.f138011r = C62942bv.mutableCopy(cqVar);
            }
            woVar4.f138011r.add(g2);
        }
        CharSequence charSequence3 = mediaDescriptionCompat.f935d;
        if (charSequence3 != null) {
            String obj2 = charSequence3.toString();
            wjVar.copyOnWrite();
            C52568wo woVar5 = (C52568wo) wjVar.instance;
            woVar5.f137994a |= 32;
            woVar5.f138002i = C58837ba.m90858g(obj2);
        }
        String g3 = C58837ba.m90858g(mediaItem.f930b.f932a);
        if (map2.containsKey(g3)) {
            String str = (String) map2.get(g3);
            if (map.containsKey(str)) {
                String str2 = (String) map.get(str);
                wjVar.copyOnWrite();
                C52568wo woVar6 = (C52568wo) wjVar.instance;
                str2.getClass();
                woVar6.f137994a |= 8;
                woVar6.f138000g = str2;
            } else {
                wjVar.copyOnWrite();
                C52568wo woVar7 = (C52568wo) wjVar.instance;
                str.getClass();
                woVar7.f137994a |= 8;
                woVar7.f138000g = str;
            }
        }
        wjVar.copyOnWrite();
        C52568wo woVar8 = (C52568wo) wjVar.instance;
        woVar8.f137995b |= 2;
        woVar8.f138012s = 4;
        C52568wo woVar9 = (C52568wo) wjVar.build();
        wfVar.copyOnWrite();
        C52560wg wgVar4 = (C52560wg) wfVar.instance;
        woVar9.getClass();
        wgVar4.f137950f = woVar9;
        wgVar4.f137945a |= 8;
        return wfVar;
    }

    /* renamed from: c */
    public static C123727au m36354c(ComponentName componentName, int i, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, int i2) {
        C123727au auVar = (C123727au) C123728av.f341753l.createBuilder();
        String packageName = componentName.getPackageName();
        auVar.copyOnWrite();
        C123728av avVar = (C123728av) auVar.instance;
        packageName.getClass();
        avVar.f341755a |= 1;
        avVar.f341756b = packageName;
        String className = componentName.getClassName();
        auVar.copyOnWrite();
        C123728av avVar2 = (C123728av) auVar.instance;
        className.getClass();
        avVar2.f341755a |= 2;
        avVar2.f341757c = className;
        auVar.copyOnWrite();
        C123728av avVar3 = (C123728av) auVar.instance;
        int i3 = i - 1;
        if (i != 0) {
            avVar3.f341761g = i3;
            avVar3.f341755a |= 16;
            auVar.copyOnWrite();
            C123728av avVar4 = (C123728av) auVar.instance;
            avVar4.f341762h = i2 - 1;
            avVar4.f341755a |= 32;
            if (axVar.mo56113h()) {
                int i4 = ((PlaybackStateCompat) axVar.mo56107c()).f994a;
                auVar.copyOnWrite();
                C123728av avVar5 = (C123728av) auVar.instance;
                avVar5.f341755a |= 128;
                avVar5.f341764j = (long) i4;
                int i5 = ((PlaybackStateCompat) axVar.mo56107c()).f999f;
                auVar.copyOnWrite();
                C123728av avVar6 = (C123728av) auVar.instance;
                avVar6.f341755a |= 256;
                avVar6.f341765k = (long) i5;
            }
            if (axVar2.mo56113h()) {
                String str = (String) axVar2.mo56107c();
                auVar.copyOnWrite();
                C123728av avVar7 = (C123728av) auVar.instance;
                str.getClass();
                avVar7.f341755a |= 8;
                avVar7.f341760f = str;
            }
            if (axVar3.mo56113h()) {
                Bundle bundle = (Bundle) axVar3.mo56107c();
                C63034ez ezVar = (C63034ez) C63037fb.f170144b.createBuilder();
                if (bundle.containsKey("com.google.android.apps.youtube.music.mediabrowser.should_include_premium_entitlement_status")) {
                    C63060fy fyVar = (C63060fy) C63063ga.f170179c.createBuilder();
                    boolean z = bundle.getBoolean("com.google.android.apps.youtube.music.mediabrowser.should_include_premium_entitlement_status");
                    fyVar.copyOnWrite();
                    C63063ga gaVar = (C63063ga) fyVar.instance;
                    gaVar.f170181a = 4;
                    gaVar.f170182b = Boolean.valueOf(z);
                    ezVar.mo59079a("com.google.android.apps.youtube.music.mediabrowser.should_include_premium_entitlement_status", (C63063ga) fyVar.build());
                }
                if (bundle.containsKey("com.google.android.apps.youtube.music.mediabrowser.user_has_premium_entitlement")) {
                    C63060fy fyVar2 = (C63060fy) C63063ga.f170179c.createBuilder();
                    boolean z2 = bundle.getBoolean("com.google.android.apps.youtube.music.mediabrowser.user_has_premium_entitlement");
                    fyVar2.copyOnWrite();
                    C63063ga gaVar2 = (C63063ga) fyVar2.instance;
                    gaVar2.f170181a = 4;
                    gaVar2.f170182b = Boolean.valueOf(z2);
                    ezVar.mo59079a("com.google.android.apps.youtube.music.mediabrowser.user_has_premium_entitlement", (C63063ga) fyVar2.build());
                }
                C63037fb fbVar = (C63037fb) ezVar.build();
                auVar.copyOnWrite();
                C123728av avVar8 = (C123728av) auVar.instance;
                fbVar.getClass();
                avVar8.f341763i = fbVar;
                avVar8.f341755a |= 64;
            }
            return auVar;
        }
        throw null;
    }

    /* renamed from: b */
    public final C60870cx mo24220b(C18913ab abVar, int i) {
        C123727au c = m36354c(abVar.mo24143a(), abVar.mo24151h(), abVar.mo24146d(), abVar.mo24145c(), abVar.mo24144b(), i);
        if (abVar.mo24150g() == null || abVar.mo24150g().isEmpty()) {
            return C60856cj.m92900i((C123728av) c.build());
        }
        return C47633f.m84733g(C60856cj.m92896e((Iterable) Collection.EL.stream(abVar.mo24150g()).filter(C18944x.f53248a).map(new C18945y(this, abVar)).collect(C58370cn.f155946a))).mo51515h(new C18946z(this, c), this.f53202c);
    }
}
