package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.apps.gsa.nga.engine.am.v.d;
import com.google.android.apps.gsa.nga.engine.p5907aj.C74849ah;
import com.google.android.apps.gsa.nga.engine.p6044n.p6049c.C76288a;
import com.google.android.apps.gsa.nga.engine.p6056o.C76534ab;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80315bj;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.ab */
/* compiled from: PG */
public final class C76291ab implements C76288a {

    /* renamed from: a */
    public static final C58974d f211323a = C58974d.m91136j();

    /* renamed from: b */
    public final Context f211324b;

    /* renamed from: c */
    public final C74849ah f211325c;

    /* renamed from: d */
    public final C76303an f211326d;

    /* renamed from: e */
    public final C83334w f211327e;

    /* renamed from: f */
    public final C81515c f211328f;

    /* renamed from: g */
    private final d f211329g;

    /* renamed from: h */
    private final C22871g f211330h;

    public C76291ab(Context context, d dVar, C74849ah ahVar, C76303an anVar, C83334w wVar, C81515c cVar, C22871g gVar) {
        this.f211324b = context;
        this.f211329g = dVar;
        this.f211325c = ahVar;
        this.f211326d = anVar;
        this.f211327e = wVar;
        this.f211328f = cVar;
        this.f211330h = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo72159a(C80295aq aqVar, C65475b bVar) {
        C80315bj bjVar;
        if (aqVar.f220359a == 12) {
            bjVar = (C80315bj) aqVar.f220360b;
        } else {
            bjVar = C80315bj.f220396c;
        }
        int i = bjVar.f220398a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            Locale forLanguageTag = Locale.forLanguageTag(bVar.f177982c);
            C74849ah ahVar = this.f211325c;
            C83320io ioVar = bVar.f177980a;
            if (ioVar == null) {
                ioVar = C83320io.f227132d;
            }
            Optional d = ahVar.mo71238d(ioVar);
            if (d.isEmpty()) {
                ((C58970a) ((C58970a) f211323a.mo56225c()).mo56372aa(3522)).mo56386p("No screenshot present.");
                mo72161c(forLanguageTag);
                return C118826c.f331423b;
            } else if (((C76534ab) d.get()).mo72226b().isEmpty()) {
                ((C58970a) ((C58970a) f211323a.mo56225c()).mo56372aa(3521)).mo56386p("No bitmap present in screenshot.");
                mo72161c(forLanguageTag);
                return C118826c.f331423b;
            } else {
                Bitmap bitmap = (Bitmap) ((C76534ab) d.get()).mo72226b().get();
                C76303an anVar = this.f211326d;
                anVar.mo72162b(anVar.f211348d.mo75121a(forLanguageTag).getString(R.string.nga_screenshot_saving_title, new Object[0]), C76302am.f211344a);
                return this.f211330h.mo28209i(this.f211329g.d(bitmap), "[NGA] executeSaveScreenshot.saveScreenshotToDisk", new C76341z(this, forLanguageTag, bitmap));
            }
        } else if (i3 == 1) {
            return this.f211330h.mo28202b("[NGA] ScreenshotExecutor.deleteScreenshot", new C76290aa(this, bjVar, bVar));
        } else {
            if (i3 == 2) {
                ((C58970a) ((C58970a) f211323a.mo56225c()).mo56372aa(3520)).mo56386p("ScreenshotOp without action");
            }
            return C118826c.f331423b;
        }
    }

    /* renamed from: b */
    public final int mo72160b() {
        return 60012;
    }

    /* renamed from: c */
    public final void mo72161c(Locale locale) {
        this.f211326d.mo72162b(this.f211328f.mo75121a(locale).getString(R.string.nga_screenshot_saving_failed, new Object[0]), C76298ai.f211336a);
    }
}
