package com.google.android.apps.search.sceneviewer.immersiveedge;

import android.net.Uri;
import com.google.android.apps.search.sceneviewer.C141550h;
import com.google.android.apps.search.sceneviewer.C141551i;
import com.google.android.apps.search.sceneviewer.C141567j;
import com.google.android.apps.search.sceneviewer.C141568k;
import com.google.android.apps.search.sceneviewer.C141569l;
import com.google.android.apps.search.sceneviewer.C141570m;
import com.google.android.libraries.p579ar.sceneviewer.utilities.LoadHelper;
import com.google.common.p4526f.C59052c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.concurrent.Callable;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.apps.search.sceneviewer.immersiveedge.h */
/* compiled from: PG */
public final /* synthetic */ class C141564h implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f384237a;

    public /* synthetic */ C141564h(String str) {
        this.f384237a = str;
    }

    public final Object call() {
        InputStream inputStream = (InputStream) LoadHelper.remoteUriToInputStreamCreator(Uri.parse(this.f384237a), (Map) null).call();
        if (inputStream == null) {
            return null;
        }
        C141550h hVar = (C141550h) C141551i.f384206d.createBuilder();
        C141569l lVar = (C141569l) C141570m.f384247e.createBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        try {
            String readLine = bufferedReader.readLine();
            String readLine2 = bufferedReader.readLine();
            String readLine3 = bufferedReader.readLine();
            String readLine4 = bufferedReader.readLine();
            String readLine5 = bufferedReader.readLine();
            if (readLine != null) {
                lVar.copyOnWrite();
                C141570m mVar = (C141570m) lVar.instance;
                mVar.f384249a |= 1;
                mVar.f384250b = readLine;
            }
            if (readLine2 != null) {
                lVar.copyOnWrite();
                C141570m mVar2 = (C141570m) lVar.instance;
                mVar2.f384249a |= 4;
                mVar2.f384252d = readLine2;
            }
            if (readLine3 != null) {
                lVar.copyOnWrite();
                C141570m mVar3 = (C141570m) lVar.instance;
                mVar3.f384249a |= 2;
                mVar3.f384251c = readLine3;
            }
            if (!(readLine4 == null || readLine5 == null)) {
                C141567j jVar = (C141567j) C141568k.f384242d.createBuilder();
                jVar.copyOnWrite();
                C141568k kVar = (C141568k) jVar.instance;
                kVar.f384244a |= 1;
                kVar.f384245b = readLine4;
                jVar.copyOnWrite();
                C141568k kVar2 = (C141568k) jVar.instance;
                kVar2.f384244a |= 2;
                kVar2.f384246c = readLine5;
                C141568k kVar3 = (C141568k) jVar.build();
                hVar.copyOnWrite();
                C141551i iVar = (C141551i) hVar.instance;
                kVar3.getClass();
                iVar.f384210c = kVar3;
                iVar.f384208a |= 2;
            }
            C141570m mVar4 = (C141570m) lVar.build();
            hVar.copyOnWrite();
            C141551i iVar2 = (C141551i) hVar.instance;
            mVar4.getClass();
            iVar2.f384209b = mVar4;
            iVar2.f384208a |= 1;
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C141565i.f384238a.mo56226d()).mo56382g(e)).mo56372aa(41735)).mo56386p("Error loading logo config");
        }
        try {
            inputStream.close();
        } catch (IOException e2) {
            ((C59052c) ((C59052c) ((C59052c) C141565i.f384238a.mo56226d()).mo56382g(e2)).mo56372aa(41734)).mo56386p("Error closing inputstream when loading logo config");
        }
        return (C141551i) hVar.build();
    }
}
