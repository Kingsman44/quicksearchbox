package com.google.android.apps.search.sceneviewer.immersiveedge;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.search.sceneviewer.C141551i;
import com.google.android.libraries.p579ar.sceneviewer.utilities.LoadHelper;
import com.google.common.p4526f.C59052c;
import com.google.common.p4541l.C59326i;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.concurrent.Callable;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.apps.search.sceneviewer.immersiveedge.d */
/* compiled from: PG */
public final /* synthetic */ class C141560d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f384231a;

    public /* synthetic */ C141560d(String str) {
        this.f384231a = str;
    }

    public final Object call() {
        C141551i iVar = null;
        InputStream inputStream = (InputStream) LoadHelper.remoteUriToInputStreamCreator(Uri.parse(this.f384231a), (Map) null).call();
        if (inputStream != null) {
            try {
                String readLine = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)).readLine();
                if (!TextUtils.isEmpty(readLine)) {
                    iVar = (C141551i) C62942bv.parseFrom((C62942bv) C141551i.f384206d, C59326i.f157516d.mo56836k(readLine), C62921ba.m95368a());
                }
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) C141562f.f384233a.mo56226d()).mo56382g(e)).mo56372aa(41732)).mo56386p("Error loading logo config");
            }
            try {
                inputStream.close();
            } catch (IOException e2) {
                ((C59052c) ((C59052c) ((C59052c) C141562f.f384233a.mo56226d()).mo56382g(e2)).mo56372aa(41731)).mo56386p("Error closing inputstream when loading logo config");
            }
        }
        return iVar;
    }
}
