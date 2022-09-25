package com.google.android.apps.gsa.staticplugins.mediabrowser;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.apps.gsa.staticplugins.mediabrowser.j */
/* compiled from: PG */
public final class C102702j {

    /* renamed from: a */
    public static final C59071e f286668a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.mediabrowser.j");

    /* renamed from: b */
    public static final C58528ij f286669b = new C58759qy("com.android.bluetooth");

    /* renamed from: c */
    final Map f286670c;

    public C102702j(Context context) {
        this.f286670c = m170302b(context.getResources().getXml(R.xml.allowed_media_browser_callers));
    }

    /* renamed from: a */
    public static PackageInfo m170301a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64);
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f286668a.mo56226d()).mo56382g(e)).mo56372aa(20954)).mo56389s("Package manager can't find package: %s", str);
            return null;
        }
    }

    /* renamed from: b */
    private static Map m170302b(XmlResourceParser xmlResourceParser) {
        HashMap hashMap = new HashMap();
        try {
            int next = xmlResourceParser.next();
            while (next != 1) {
                if (next == 2 && xmlResourceParser.getName().equals("signing_certificate")) {
                    String attributeValue = xmlResourceParser.getAttributeValue((String) null, "name");
                    attributeValue.getClass();
                    String attributeValue2 = xmlResourceParser.getAttributeValue((String) null, "package");
                    attributeValue2.getClass();
                    boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue((String) null, BuildConfig.BUILD_TYPE, false);
                    String replaceAll = xmlResourceParser.nextText().replaceAll("\\s|\\n", BuildConfig.FLAVOR);
                    C102701i iVar = new C102701i(attributeValue, attributeValue2, attributeBooleanValue);
                    ArrayList arrayList = (ArrayList) hashMap.get(replaceAll);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(replaceAll, arrayList);
                    }
                    arrayList.add(iVar);
                }
                next = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException e) {
            ((C59052c) ((C59052c) ((C59052c) f286668a.mo56226d()).mo56382g(e)).mo56372aa(20955)).mo56386p("Could not read allowed callers from XML.");
        }
        return hashMap;
    }
}
