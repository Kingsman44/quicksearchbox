package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.e */
/* compiled from: PG */
public final class C123968e implements C123977n {

    /* renamed from: a */
    private final C123978o f342423a;

    /* renamed from: b */
    private final C58974d f342424b;

    /* renamed from: c */
    private final C130603a f342425c;

    public C123968e(C123978o oVar, C130603a aVar) {
        this.f342423a = oVar;
        this.f342424b = aVar.mo109740b(this);
        this.f342425c = aVar;
    }

    /* renamed from: a */
    public final Optional mo106216a(C52560wg wgVar, C50690ab abVar) {
        if (mo106220b(wgVar, abVar)) {
            return Optional.m71637of(new C123967d(wgVar, abVar, this.f342423a, this.f342425c));
        }
        return Optional.empty();
    }

    /* renamed from: b */
    public final boolean mo106220b(C52560wg wgVar, C50690ab abVar) {
        C51058ev evVar;
        C51058ev evVar2;
        C51058ev evVar3;
        C51058ev evVar4;
        C51058ev evVar5;
        C51098gh ghVar = wgVar.f137949e;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        if (evVar.f132944b.isEmpty()) {
            ((C58970a) ((C58970a) this.f342424b.mo56226d()).mo56372aa(35304)).mo56387q("#validateMediaItem: MediaItem has no package name. Source: %d", abVar.f131877e);
            return false;
        } else if (abVar.equals(C50690ab.MEDIA_SESSION) || !wgVar.f137948d.isEmpty() || !wgVar.f137952h.isEmpty()) {
            C52568wo woVar = wgVar.f137950f;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            C51012dc dcVar = woVar.f138004k;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            if (dcVar.f132817c.isEmpty()) {
                C52568wo woVar2 = wgVar.f137950f;
                if (woVar2 == null) {
                    woVar2 = C52568wo.f137992v;
                }
                C51012dc dcVar2 = woVar2.f138004k;
                if (dcVar2 == null) {
                    dcVar2 = C51012dc.f132813k;
                }
                if (dcVar2.f132819e.mo59173M()) {
                    C58970a aVar = (C58970a) ((C58970a) this.f342424b.mo56226d()).mo56372aa(35302);
                    C51098gh ghVar2 = wgVar.f137949e;
                    if (ghVar2 == null) {
                        ghVar2 = C51098gh.f133009e;
                    }
                    if (ghVar2.f133012b == 1) {
                        evVar4 = (C51058ev) ghVar2.f133013c;
                    } else {
                        evVar4 = C51058ev.f132941o;
                    }
                    String str = evVar4.f132944b;
                    C52568wo woVar3 = wgVar.f137950f;
                    if (woVar3 == null) {
                        woVar3 = C52568wo.f137992v;
                    }
                    aVar.mo56354G("#validateMediaItem: MediaItem has no image uri or content. { app: %s, title: %s }", str, woVar3.f137998e);
                    return false;
                }
            }
            C52568wo woVar4 = wgVar.f137950f;
            if (woVar4 == null) {
                woVar4 = C52568wo.f137992v;
            }
            if (woVar4.f137998e.isEmpty()) {
                C58970a aVar2 = (C58970a) ((C58970a) this.f342424b.mo56226d()).mo56372aa(35301);
                C51098gh ghVar3 = wgVar.f137949e;
                if (ghVar3 == null) {
                    ghVar3 = C51098gh.f133009e;
                }
                if (ghVar3.f133012b == 1) {
                    evVar3 = (C51058ev) ghVar3.f133013c;
                } else {
                    evVar3 = C51058ev.f132941o;
                }
                aVar2.mo56359L("#validateMediaItem: MediaItem has no title. { app: %s, mediaId: %s, uri: %s }", evVar3.f132944b, wgVar.f137952h, wgVar.f137948d);
                return false;
            }
            C52568wo woVar5 = wgVar.f137950f;
            if (woVar5 == null) {
                woVar5 = C52568wo.f137992v;
            }
            if (woVar5.f137999f.isEmpty()) {
                C58970a aVar3 = (C58970a) ((C58970a) this.f342424b.mo56226d()).mo56372aa(35300);
                C51098gh ghVar4 = wgVar.f137949e;
                if (ghVar4 == null) {
                    ghVar4 = C51098gh.f133009e;
                }
                if (ghVar4.f133012b == 1) {
                    evVar2 = (C51058ev) ghVar4.f133013c;
                } else {
                    evVar2 = C51058ev.f132941o;
                }
                String str2 = evVar2.f132944b;
                C52568wo woVar6 = wgVar.f137950f;
                if (woVar6 == null) {
                    woVar6 = C52568wo.f137992v;
                }
                aVar3.mo56354G("#validateMediaItem: MediaItem has no artist. { app: %s, title: %s }", str2, woVar6.f137998e);
            }
            return true;
        } else {
            C58970a aVar4 = (C58970a) ((C58970a) this.f342424b.mo56226d()).mo56372aa(35303);
            C51098gh ghVar5 = wgVar.f137949e;
            if (ghVar5 == null) {
                ghVar5 = C51098gh.f133009e;
            }
            if (ghVar5.f133012b == 1) {
                evVar5 = (C51058ev) ghVar5.f133013c;
            } else {
                evVar5 = C51058ev.f132941o;
            }
            String str3 = evVar5.f132944b;
            C52568wo woVar7 = wgVar.f137950f;
            if (woVar7 == null) {
                woVar7 = C52568wo.f137992v;
            }
            aVar4.mo56354G("#validateMediaItem: MediaItem has no uri or mediaId.  { app: %s, title: %s }", str3, woVar7.f137998e);
            return false;
        }
    }
}
