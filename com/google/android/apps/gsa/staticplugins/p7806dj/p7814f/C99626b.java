package com.google.android.apps.gsa.staticplugins.p7806dj.p7814f;

import android.content.Context;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99594a;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99595b;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99596c;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99597d;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7811e.p7812a.C99621a;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118640c;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118642e;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118644g;
import com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b.C118646i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62947c;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.dj.f.b */
/* compiled from: PG */
public final class C99626b extends C86734a implements C99621a {

    /* renamed from: a */
    public C99597d f278786a = C99597d.f278723b;

    /* renamed from: b */
    private final C22871g f278787b;

    /* renamed from: c */
    private final Context f278788c;

    public C99626b(C22871g gVar, Context context) {
        super(C118575h.WORKER_SETTINGS_SEARCH, "settingssearch");
        this.f278787b = gVar;
        this.f278788c = context;
    }

    /* renamed from: a */
    public final C60870cx mo91512a(String str) {
        return this.f278787b.mo28201a("Get queried settings results.", new C99625a(this, str));
    }

    /* renamed from: b */
    public final void mo91513b(List list, List list2, List list3, List list4) {
        C99594a aVar = (C99594a) C99597d.f278723b.createBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C118642e eVar = (C118642e) it.next();
            C99595b bVar = (C99595b) C99596c.f278716f.createBuilder();
            String str = eVar.f330987b;
            bVar.copyOnWrite();
            C99596c cVar = (C99596c) bVar.instance;
            str.getClass();
            cVar.f278718a |= 1;
            cVar.f278719b = str;
            String str2 = eVar.f330988c;
            bVar.copyOnWrite();
            C99596c cVar2 = (C99596c) bVar.instance;
            str2.getClass();
            cVar2.f278718a |= 4;
            cVar2.f278721d = str2;
            aVar.mo91497a((C99596c) bVar.build());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C118644g gVar = (C118644g) it2.next();
            List c = mo91514c(gVar.f330992b, gVar.f330993c);
            aVar.copyOnWrite();
            C99597d dVar = (C99597d) aVar.instance;
            dVar.mo91498a();
            C62947c.addAll((Iterable) c, (List) dVar.f278725a);
        }
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            C118640c cVar3 = (C118640c) it3.next();
            if (!cVar3.f330983f) {
                C99595b bVar2 = (C99595b) C99596c.f278716f.createBuilder();
                String str3 = cVar3.f330979b;
                bVar2.copyOnWrite();
                C99596c cVar4 = (C99596c) bVar2.instance;
                str3.getClass();
                cVar4.f278718a |= 8;
                cVar4.f278722e = str3;
                String str4 = cVar3.f330980c;
                bVar2.copyOnWrite();
                C99596c cVar5 = (C99596c) bVar2.instance;
                str4.getClass();
                cVar5.f278718a |= 1;
                cVar5.f278719b = str4;
                String str5 = cVar3.f330982e;
                bVar2.copyOnWrite();
                C99596c cVar6 = (C99596c) bVar2.instance;
                str5.getClass();
                cVar6.f278718a |= 4;
                cVar6.f278721d = str5;
                if ((cVar3.f330978a & 4) != 0) {
                    String str6 = cVar3.f330981d;
                    bVar2.copyOnWrite();
                    C99596c cVar7 = (C99596c) bVar2.instance;
                    str6.getClass();
                    cVar7.f278718a |= 2;
                    cVar7.f278720c = str6;
                }
                aVar.mo91497a((C99596c) bVar2.build());
            }
        }
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            C118646i iVar = (C118646i) it4.next();
            C99595b bVar3 = (C99595b) C99596c.f278716f.createBuilder();
            String str7 = iVar.f330997b;
            bVar3.copyOnWrite();
            C99596c cVar8 = (C99596c) bVar3.instance;
            str7.getClass();
            cVar8.f278718a |= 1;
            cVar8.f278719b = str7;
            if ((iVar.f330996a & 2) != 0) {
                String str8 = iVar.f330998c;
                bVar3.copyOnWrite();
                C99596c cVar9 = (C99596c) bVar3.instance;
                str8.getClass();
                cVar9.f278718a |= 2;
                cVar9.f278720c = str8;
            }
            aVar.mo91497a((C99596c) bVar3.build());
        }
        this.f278786a = (C99597d) aVar.build();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ff, code lost:
        if (r2 == null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0125, code lost:
        if (r2 == null) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bf A[Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104, all -> 0x0102 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo91514c(int r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = "SettingsSearchWorker"
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 0
            android.content.Context r4 = r11.f278788c     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            android.content.res.XmlResourceParser r2 = r4.getXml(r12)     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            int r12 = r2.getDepth()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
        L_0x0017:
            int r4 = r2.next()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r5 = 2
            r6 = 1
            if (r4 != r6) goto L_0x0020
            goto L_0x0023
        L_0x0020:
            if (r4 == r5) goto L_0x0023
            goto L_0x0017
        L_0x0023:
            int r4 = r2.next()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            if (r4 == r6) goto L_0x00ff
            r7 = 3
            if (r4 != r7) goto L_0x0032
            int r4 = r2.getDepth()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            if (r4 <= r12) goto L_0x00ff
        L_0x0032:
            com.google.android.apps.gsa.staticplugins.dj.a.c r4 = com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99596c.f278716f     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            com.google.android.apps.gsa.staticplugins.dj.a.b r4 = (com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99595b) r4     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r7 = 0
        L_0x003b:
            int r8 = r2.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            if (r7 >= r8) goto L_0x00d9
            java.lang.String r8 = r2.getAttributeName(r7)     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            int r9 = r8.hashCode()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r10 = -1857640538(0xffffffff9146a7a6, float:-1.5671107E-28)
            if (r9 == r10) goto L_0x006d
            r10 = 106079(0x19e5f, float:1.48648E-40)
            if (r9 == r10) goto L_0x0063
            r10 = 110371416(0x6942258, float:5.5721876E-35)
            if (r9 == r10) goto L_0x0059
            goto L_0x0077
        L_0x0059:
            java.lang.String r9 = "title"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0077
            r8 = 1
            goto L_0x0078
        L_0x0063:
            java.lang.String r9 = "key"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0077
            r8 = 0
            goto L_0x0078
        L_0x006d:
            java.lang.String r9 = "summary"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0077
            r8 = 2
            goto L_0x0078
        L_0x0077:
            r8 = -1
        L_0x0078:
            if (r8 == 0) goto L_0x00bf
            if (r8 == r6) goto L_0x009f
            if (r8 == r5) goto L_0x007f
            goto L_0x00d5
        L_0x007f:
            android.content.Context r8 = r11.f278788c     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            int r9 = r2.getAttributeResourceValue(r7, r3)     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            java.lang.String r8 = r8.getString(r9)     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r4.copyOnWrite()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            com.google.protobuf.bv r9 = r4.instance     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            com.google.android.apps.gsa.staticplugins.dj.a.c r9 = (com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99596c) r9     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r8.getClass()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            int r10 = r9.f278718a     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r10 = r10 | r5
            r9.f278718a = r10     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r9.f278720c = r8     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            goto L_0x00d5
        L_0x009f:
            android.content.Context r8 = r11.f278788c     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            int r9 = r2.getAttributeResourceValue(r7, r3)     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            java.lang.String r8 = r8.getString(r9)     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r4.copyOnWrite()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            com.google.protobuf.bv r9 = r4.instance     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            com.google.android.apps.gsa.staticplugins.dj.a.c r9 = (com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99596c) r9     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r8.getClass()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            int r10 = r9.f278718a     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r10 = r10 | r6
            r9.f278718a = r10     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r9.f278719b = r8     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            goto L_0x00d5
        L_0x00bf:
            java.lang.String r8 = r2.getAttributeValue(r7)     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r4.copyOnWrite()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            com.google.protobuf.bv r9 = r4.instance     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            com.google.android.apps.gsa.staticplugins.dj.a.c r9 = (com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99596c) r9     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r8.getClass()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            int r10 = r9.f278718a     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r10 = r10 | 8
            r9.f278718a = r10     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r9.f278722e = r8     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
        L_0x00d5:
            int r7 = r7 + 1
            goto L_0x003b
        L_0x00d9:
            com.google.protobuf.bv r7 = r4.instance     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            com.google.android.apps.gsa.staticplugins.dj.a.c r7 = (com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99596c) r7     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            int r7 = r7.f278718a     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r7 = r7 & r6
            if (r7 == 0) goto L_0x0023
            r4.copyOnWrite()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            com.google.protobuf.bv r7 = r4.instance     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            com.google.android.apps.gsa.staticplugins.dj.a.c r7 = (com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99596c) r7     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r13.getClass()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            int r8 = r7.f278718a     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r8 = r8 | 4
            r7.f278718a = r8     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r7.f278721d = r13     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            com.google.android.apps.gsa.staticplugins.dj.a.c r4 = (com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99596c) r4     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            r1.add(r4)     // Catch:{ XmlPullParserException -> 0x0108, IOException -> 0x0106, NotFoundException -> 0x0104 }
            goto L_0x0023
        L_0x00ff:
            if (r2 == 0) goto L_0x012a
            goto L_0x0127
        L_0x0102:
            r12 = move-exception
            goto L_0x012b
        L_0x0104:
            r12 = move-exception
            goto L_0x010a
        L_0x0106:
            r12 = move-exception
            goto L_0x0114
        L_0x0108:
            r12 = move-exception
            goto L_0x011e
        L_0x010a:
            java.lang.String r13 = "Resource not found error parsing preferences."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0102 }
            com.google.android.libraries.gsa.monet.shared.p1893c.C23095a.m43280c(r0, r12, r13, r3)     // Catch:{ all -> 0x0102 }
            if (r2 == 0) goto L_0x012a
            goto L_0x0127
        L_0x0114:
            java.lang.String r13 = "IO Error parsing preferences."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0102 }
            com.google.android.libraries.gsa.monet.shared.p1893c.C23095a.m43280c(r0, r12, r13, r3)     // Catch:{ all -> 0x0102 }
            if (r2 == 0) goto L_0x012a
            goto L_0x0127
        L_0x011e:
            java.lang.String r13 = "XML Error parsing preferences."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0102 }
            com.google.android.libraries.gsa.monet.shared.p1893c.C23095a.m43280c(r0, r12, r13, r3)     // Catch:{ all -> 0x0102 }
            if (r2 == 0) goto L_0x012a
        L_0x0127:
            r2.close()
        L_0x012a:
            return r1
        L_0x012b:
            if (r2 == 0) goto L_0x0130
            r2.close()
        L_0x0130:
            goto L_0x0132
        L_0x0131:
            throw r12
        L_0x0132:
            goto L_0x0131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7806dj.p7814f.C99626b.mo91514c(int, java.lang.String):java.util.List");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
