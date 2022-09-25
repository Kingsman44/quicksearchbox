package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8744l;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88165ro;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88168rr;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88543c;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.C88582c;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89196a;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p7066m.C89974am;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.staticplugins.searchboxroot.C117025g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.C41678d;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.android.libraries.searchbox.shared.suggestion.C41682h;
import com.google.android.libraries.searchbox.shared.suggestion.C41683i;
import com.google.android.libraries.searchbox.shared.suggestion.C41692r;
import com.google.android.libraries.searchbox.shared.suggestion.C41693s;
import com.google.android.libraries.searchbox.shared.suggestion.C41698x;
import com.google.android.libraries.searchbox.shared.suggestion.C41699y;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.l.e */
/* compiled from: PG */
public final class C116985e extends C88582c implements C89196a, C89200e {

    /* renamed from: a */
    public static final C59071e f324765a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchboxroot.features.l.e");

    /* renamed from: b */
    public final C117025g f324766b;

    /* renamed from: c */
    public final ContentResolver f324767c;

    /* renamed from: d */
    public final HashMap f324768d = new HashMap();

    /* renamed from: e */
    public final HashMap f324769e = new HashMap();

    /* renamed from: f */
    private final C86124t f324770f;

    /* renamed from: g */
    private final C68214a f324771g;

    /* renamed from: h */
    private C90931ca f324772h;

    /* renamed from: i */
    private C88543c f324773i;

    public C116985e(C117025g gVar, Context context, C86124t tVar, C68214a aVar) {
        this.f324766b = gVar;
        this.f324767c = context.getContentResolver();
        this.f324770f = tVar;
        this.f324771g = aVar;
    }

    /* renamed from: a */
    static final RootSuggestion m194404a(String str, Bitmap bitmap, C63088z zVar, Uri uri, String str2) {
        String str3;
        C41698x xVar = (C41698x) C41699y.f109072f.createBuilder();
        if (!(bitmap == null || zVar == null)) {
            xVar.copyOnWrite();
            C41699y yVar = (C41699y) xVar.instance;
            yVar.f109074a |= 2;
            yVar.f109076c = zVar;
            int width = bitmap.getWidth();
            xVar.copyOnWrite();
            C41699y yVar2 = (C41699y) xVar.instance;
            yVar2.f109074a |= 4;
            yVar2.f109077d = width;
            int height = bitmap.getHeight();
            xVar.copyOnWrite();
            C41699y yVar3 = (C41699y) xVar.instance;
            yVar3.f109074a |= 8;
            yVar3.f109078e = height;
        }
        if (uri != null) {
            String uri2 = uri.toString();
            xVar.copyOnWrite();
            C41699y yVar4 = (C41699y) xVar.instance;
            uri2.getClass();
            yVar4.f109074a |= 1;
            yVar4.f109075b = uri2;
        }
        C41678d dVar = (C41678d) C41679e.f109005p.createBuilder();
        C41692r rVar = (C41692r) C41693s.f109053h.createBuilder();
        rVar.copyOnWrite();
        C41693s sVar = (C41693s) rVar.instance;
        str2.getClass();
        sVar.f109055a |= 32;
        sVar.f109061g = str2;
        String queryParameter = Uri.parse(str2).getQueryParameter("component");
        if (TextUtils.isEmpty(queryParameter)) {
            str3 = BuildConfig.FLAVOR;
        } else {
            str3 = ComponentName.unflattenFromString(queryParameter).getPackageName();
        }
        rVar.copyOnWrite();
        C41693s sVar2 = (C41693s) rVar.instance;
        str3.getClass();
        sVar2.f109055a |= 8;
        sVar2.f109059e = str3;
        dVar.copyOnWrite();
        C41679e eVar = (C41679e) dVar.instance;
        C41693s sVar3 = (C41693s) rVar.build();
        sVar3.getClass();
        eVar.f109009c = sVar3;
        eVar.f109007a |= 4;
        dVar.copyOnWrite();
        C41679e eVar2 = (C41679e) dVar.instance;
        C41699y yVar5 = (C41699y) xVar.build();
        yVar5.getClass();
        eVar2.f109017k = yVar5;
        eVar2.f109007a |= 1024;
        return new RootSuggestion(str, 19, 84, C58485gu.m89846n(223), BuildConfig.FLAVOR, C41669ai.f108958g, 0, (C54228aq) null, (C41679e) dVar.build());
    }

    /* renamed from: b */
    private final boolean m194405b(C88168rr rrVar) {
        if (!this.f324770f.mo79746e(C90085ej.f250244v) || TextUtils.isEmpty(((C86338r) this.f324771g.mo27525b()).getString("qsb_super_g_image_path", BuildConfig.FLAVOR))) {
            return false;
        }
        if ((rrVar.f238347e == 1 || this.f324770f.mo79746e(C89974am.f246588b)) && ((C86338r) this.f324771g.mo27525b()).getBoolean("doodle_in_qsb_enabled", true)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f324773i = ((C88614r) obj).f239530a;
    }

    /* renamed from: f */
    public final void mo82222f(C90931ca caVar) {
        this.f324772h = caVar;
    }

    /* renamed from: g */
    public final /* synthetic */ void mo82223g(C22871g gVar) {
    }

    /* renamed from: h */
    public final void mo82224h() {
    }

    /* renamed from: hF */
    public final /* synthetic */ void mo82225hF(C22871g gVar) {
    }

    /* renamed from: hG */
    public final /* synthetic */ void mo82226hG(C22871g gVar) {
    }

    /* renamed from: i */
    public final void mo82227i() {
    }

    /* renamed from: l */
    public final C41626a mo82235l(C41642a aVar) {
        RootSuggestion rootSuggestion = null;
        if (!((C88616t) aVar).f239556a.mo84352bk().isEmpty()) {
            return null;
        }
        C88168rr b = this.f324766b.mo103106b();
        Bundle a = this.f324766b.mo103105a();
        b.getClass();
        a.getClass();
        C62971cq<C88165ro> cqVar = b.f238344b;
        ArrayList arrayList = new ArrayList();
        for (C88165ro roVar : cqVar) {
            String str = roVar.f238336b;
            String str2 = roVar.f238337c;
            Uri parse = (roVar.f238335a & 8) != 0 ? Uri.parse(roVar.f238339e) : null;
            Bitmap bitmap = (Bitmap) a.getParcelable(roVar.f238338d);
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(allocate);
            allocate.rewind();
            arrayList.add(m194404a(str, bitmap, C63088z.m96153z(allocate), parse, str2));
        }
        if (m194405b(b)) {
            String string = ((C86338r) this.f324771g.mo27525b()).getString("qsb_suggest_image_path", BuildConfig.FLAVOR);
            int i = ((C86338r) this.f324771g.mo27525b()).getInt("doodle_medium_image_background_color", -1);
            if (TextUtils.isEmpty(string)) {
                C59104x c = f324765a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "sb.r.PixelSugSrc");
                ((C59052c) ((C59052c) c).mo56372aa(32545)).mo56386p("QSB_SUGGEST_IMAGE_PATH was empty");
            } else {
                C41682h hVar = (C41682h) C41683i.f109026d.createBuilder();
                hVar.copyOnWrite();
                C41683i iVar = (C41683i) hVar.instance;
                string.getClass();
                iVar.f109028a |= 1;
                iVar.f109029b = string;
                hVar.copyOnWrite();
                C41683i iVar2 = (C41683i) hVar.instance;
                iVar2.f109028a |= 2;
                iVar2.f109030c = i;
                C41683i iVar3 = (C41683i) hVar.build();
                C41678d dVar = (C41678d) C41679e.f109005p.createBuilder();
                dVar.copyOnWrite();
                C41679e eVar = (C41679e) dVar.instance;
                iVar3.getClass();
                eVar.f109019m = iVar3;
                eVar.f109007a |= 4096;
                rootSuggestion = new RootSuggestion(BuildConfig.FLAVOR, 19, 123, C58485gu.m89845m(), BuildConfig.FLAVOR, Integer.valueOf(C41669ai.f108957f.intValue()), 1500, (C54228aq) null, (C41679e) dVar.build());
            }
            if (rootSuggestion != null) {
                arrayList.add(rootSuggestion);
            }
        }
        return new C41626a(arrayList);
    }

    /* renamed from: m */
    public final C60870cx mo82236m(C41642a aVar) {
        return this.f324772h.mo85138c(new C116984d(this, aVar));
    }

    /* renamed from: o */
    public final boolean mo82238o(C41642a aVar) {
        C88168rr b;
        C88616t tVar = (C88616t) aVar;
        if (tVar.f239557b != 1 || !"web".equals(tVar.f239558c) || !tVar.f239556a.mo84406cm() || (b = this.f324766b.mo103106b()) == null || this.f324766b.mo103105a() == null) {
            return false;
        }
        if (tVar.f239556a.mo84352bk().isEmpty()) {
            boolean b2 = m194405b(b);
            this.f324773i.mo82178D(b.f238347e, b2, b.f238348f, !((C86338r) this.f324771g.mo27525b()).getBoolean("doodle_in_qsb_enabled", true));
            if (b.f238344b.size() <= 0 && !b2) {
                return false;
            }
        }
        return true;
    }
}
