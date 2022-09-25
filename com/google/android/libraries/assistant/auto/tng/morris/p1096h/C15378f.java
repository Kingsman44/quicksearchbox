package com.google.android.libraries.assistant.auto.tng.morris.p1096h;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.h.f */
/* compiled from: PG */
public final class C15378f {

    /* renamed from: a */
    private static final C59071e f46154a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.h.f");

    /* renamed from: b */
    private final PackageManager f46155b;

    /* renamed from: c */
    private final C86124t f46156c;

    /* renamed from: d */
    private final C21370a f46157d;

    /* renamed from: e */
    private final C15382j f46158e;

    public C15378f(Context context, C86124t tVar, C15382j jVar, C21370a aVar) {
        this.f46155b = context.getPackageManager();
        this.f46156c = tVar;
        this.f46158e = jVar;
        this.f46157d = aVar;
    }

    /* renamed from: c */
    private final boolean m31989c(String str) {
        if (!this.f46156c.mo79745c(C90051dc.f248875bd).contains(str)) {
            return false;
        }
        C59104x b = f46154a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.PkgValidator");
        ((C59052c) ((C59052c) b).mo56372aa(46096)).mo56389s("[%s] denied by media app playback deny list", str);
        return true;
    }

    /* renamed from: d */
    private final boolean m31990d(String str) {
        if (m31991e(str)) {
            return true;
        }
        C58976aa aaVar = C58975e.f156826a;
        return false;
    }

    /* renamed from: e */
    private final boolean m31991e(String str) {
        String attributeValue;
        try {
            ApplicationInfo applicationInfo = this.f46155b.getApplicationInfo(str, 128);
            if (applicationInfo.metaData == null) {
                C59104x d = f46154a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Morris.PkgValidator");
                ((C59052c) ((C59052c) d).mo56372aa(46103)).mo56386p("ApplicationInfo metadata is null");
                return false;
            }
            int i = applicationInfo.metaData.getInt("com.google.android.gms.car.application", 0);
            if (i != 0) {
                try {
                    XmlResourceParser xml = this.f46155b.getResourcesForApplication(str).getXml(i);
                    if (xml == null) {
                        C59104x d2 = f46154a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "Morris.PkgValidator");
                        ((C59052c) ((C59052c) d2).mo56372aa(46100)).mo56386p("Parser is null");
                        return false;
                    }
                    try {
                        for (int next = xml.next(); next != 1; next = xml.next()) {
                            if (next == 2 && "uses".equals(xml.getName()) && (attributeValue = xml.getAttributeValue((String) null, "name")) != null) {
                                if (C58890d.m90988c(attributeValue).equals("media")) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    } catch (IOException | XmlPullParserException e) {
                        C59104x c = f46154a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "Morris.PkgValidator");
                        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(46099)).mo56389s("Resource not parsable [%s]", str);
                        return false;
                    }
                } catch (PackageManager.NameNotFoundException | Resources.NotFoundException | NullPointerException e2) {
                    C59104x c2 = f46154a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "Morris.PkgValidator");
                    ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(46101)).mo56389s("Resource not found [%s]", str);
                    return false;
                }
            } else {
                C59104x d3 = f46154a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "Morris.PkgValidator");
                ((C59052c) ((C59052c) d3).mo56372aa(46098)).mo56352E("[%s] metadata id %d not valid", str, 0);
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            C59104x d4 = f46154a.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "Morris.PkgValidator");
            ((C59052c) ((C59052c) d4).mo56372aa(46102)).mo56389s("Cannot find package [%s]", str);
            return false;
        }
    }

    /* renamed from: a */
    public final List mo22269a() {
        this.f46157d.mo26870b();
        ArrayList arrayList = new ArrayList();
        for (ComponentName componentName : this.f46158e.mo22273i()) {
            String packageName = componentName.getPackageName();
            String className = componentName.getClassName();
            if (this.f46156c.mo79745c(C90051dc.f248874bc).contains(packageName) || (!this.f46156c.mo79746e(C90051dc.f248832an) && className.equals("com.google.android.libraries.assistant.auto.tng.media.mediabrowser.NewsMediaBrowserService"))) {
                C58976aa aaVar = C58975e.f156826a;
            } else if (!m31989c(packageName) && m31990d(packageName)) {
                arrayList.add(componentName);
            }
            C58976aa aaVar2 = C58975e.f156826a;
        }
        C58976aa aaVar3 = C58975e.f156826a;
        this.f46157d.mo26870b();
        return arrayList;
    }

    /* renamed from: b */
    public final boolean mo22270b(String str) {
        if (TextUtils.isEmpty(str)) {
            C59104x d = f46154a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.PkgValidator");
            ((C59052c) ((C59052c) d).mo56372aa(46104)).mo56386p("#validateMediaSessionForMediaPlayer() packageName was empty");
            return false;
        } else if (m31989c(str) || !m31990d(str)) {
            return false;
        } else {
            return true;
        }
    }
}
