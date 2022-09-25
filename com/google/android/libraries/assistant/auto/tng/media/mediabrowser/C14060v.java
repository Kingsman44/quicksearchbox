package com.google.android.libraries.assistant.auto.tng.media.mediabrowser;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.C143701ac;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p3186j$.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.v */
/* compiled from: PG */
public final class C14060v {

    /* renamed from: a */
    public static final C59071e f42696a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.media.mediabrowser.v");

    /* renamed from: b */
    public static final C58528ij f42697b = new C58759qy("com.android.bluetooth");

    /* renamed from: c */
    public final C69464a f42698c;

    /* renamed from: d */
    public final C143701ac f42699d;

    /* renamed from: e */
    Map f42700e = new HashMap();

    public C14060v(C143701ac acVar, C69464a aVar) {
        this.f42698c = aVar;
        this.f42699d = acVar;
    }

    /* renamed from: a */
    public static PackageInfo m30349a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64);
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f42696a.mo56226d()).mo56382g(e)).mo56372aa(45286)).mo56389s("Package manager can't find package: %s", str);
            return null;
        }
    }

    /* renamed from: b */
    public static Map m30350b(XmlResourceParser xmlResourceParser) {
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
                    ((ArrayList) Map.EL.computeIfAbsent(hashMap, replaceAll, C14058t.f42692a)).add(new C14059u(attributeValue, attributeValue2, attributeBooleanValue));
                }
                next = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException e) {
            ((C59052c) ((C59052c) ((C59052c) f42696a.mo56226d()).mo56382g(e)).mo56372aa(45287)).mo56386p("Could not read allowed callers from XML.");
        }
        return hashMap;
    }
}
