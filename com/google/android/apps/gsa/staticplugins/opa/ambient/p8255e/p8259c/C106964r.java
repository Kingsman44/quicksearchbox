package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.content.Context;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.r */
/* compiled from: PG */
public final class C106964r implements C106869ad {

    /* renamed from: a */
    private final Context f297943a;

    /* renamed from: b */
    private final C58974d f297944b;

    /* renamed from: c */
    private final C83564a f297945c;

    public C106964r(Context context, C83564a aVar) {
        this.f297943a = context;
        this.f297944b = aVar.mo76900a("DefaultMediaFactory");
        this.f297945c = aVar;
    }

    /* renamed from: a */
    public final C58833ax mo95711a(C52560wg wgVar, C50690ab abVar) {
        return mo95723b(wgVar, abVar) ? C58833ax.m90834k(new C106963q(this.f297943a, this.f297945c, wgVar, abVar)) : C58836b.f156633a;
    }

    /* renamed from: b */
    public final boolean mo95723b(C52560wg wgVar, C50690ab abVar) {
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
            ((C58970a) ((C58970a) this.f297944b.mo56226d()).mo56372aa(23352)).mo56387q("#validateMediaItem: MediaItem has no package name. Source: %d", abVar.f131877e);
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
                    C58970a aVar = (C58970a) ((C58970a) this.f297944b.mo56226d()).mo56372aa(23350);
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
                C58970a aVar2 = (C58970a) ((C58970a) this.f297944b.mo56226d()).mo56372aa(23349);
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
                C58970a aVar3 = (C58970a) ((C58970a) this.f297944b.mo56226d()).mo56372aa(23348);
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
            C58970a aVar4 = (C58970a) ((C58970a) this.f297944b.mo56226d()).mo56372aa(23351);
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
