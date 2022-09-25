package com.google.android.apps.gsa.sidekick.shared.cards;

import android.content.Intent;
import android.os.AsyncTask;
import com.google.android.apps.p489g.p494d.C9228dj;
import com.google.android.apps.p489g.p494d.C9230dl;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.e */
/* compiled from: PG */
final class C91690e extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ C91691f f255776a;

    public C91690e(C91691f fVar) {
        this.f255776a = fVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.String} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.p489g.p494d.C9230dl doInBackground(com.google.android.apps.p489g.p494d.C9230dl... r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = r10[r0]
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.android.apps.g.d.dk r1 = (com.google.android.apps.p489g.p494d.C9229dk) r1
            com.google.protobuf.bv r2 = r1.instance     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.apps.g.d.dl r2 = (com.google.android.apps.p489g.p494d.C9230dl) r2     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            int r2 = r2.f31905a     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            r3 = 2
            r2 = r2 & r3
            r4 = 3
            if (r2 == 0) goto L_0x0055
            com.google.android.apps.gsa.sidekick.shared.cards.f r2 = r9.f255776a     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.apps.gsa.sidekick.shared.cards.g r2 = r2.f255779b     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r2 = r2.mo86172j()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            boolean r2 = r2.mo49318m()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            if (r2 != 0) goto L_0x002a
            com.google.protobuf.bv r2 = r1.instance     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.apps.g.d.dl r2 = (com.google.android.apps.p489g.p494d.C9230dl) r2     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            java.lang.String r2 = r2.f31907c     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            goto L_0x0044
        L_0x002a:
            com.google.android.apps.gsa.sidekick.shared.cards.f r2 = r9.f255776a     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.apps.gsa.sidekick.shared.cards.g r2 = r2.f255779b     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.apps.gsa.sidekick.shared.e.a.k r2 = r2.mo86167f()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.protobuf.bv r6 = r1.instance     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.apps.g.d.dl r6 = (com.google.android.apps.p489g.p494d.C9230dl) r6     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            java.lang.String r6 = r6.f31907c     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.common.util.concurrent.cx r2 = r2.mo86216c(r6)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            java.lang.Object r2 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148473g(r2, r4, r6)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
        L_0x0044:
            r1.copyOnWrite()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.protobuf.bv r6 = r1.instance     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.apps.g.d.dl r6 = (com.google.android.apps.p489g.p494d.C9230dl) r6     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            r2.getClass()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            int r7 = r6.f31905a     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            r7 = r7 | r3
            r6.f31905a = r7     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            r6.f31907c = r2     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
        L_0x0055:
            r1.copyOnWrite()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.protobuf.bv r2 = r1.instance     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.apps.g.d.dl r2 = (com.google.android.apps.p489g.p494d.C9230dl) r2     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.protobuf.cq r6 = com.google.android.apps.p489g.p494d.C9230dl.emptyProtobufList()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            r2.f31909e = r6     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            r10 = r10[r0]     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.protobuf.cq r10 = r10.f31909e     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
        L_0x006a:
            boolean r0 = r10.hasNext()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r0 = r10.next()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.apps.g.d.dj r0 = (com.google.android.apps.p489g.p494d.C9228dj) r0     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.protobuf.bn r0 = r0.toBuilder()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.apps.g.d.di r0 = (com.google.android.apps.p489g.p494d.C9227di) r0     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.apps.g.d.dj r2 = (com.google.android.apps.p489g.p494d.C9228dj) r2     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            int r2 = r2.f31901a     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            if (r2 != r3) goto L_0x00d1
            com.google.android.apps.gsa.sidekick.shared.cards.f r2 = r9.f255776a     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.apps.gsa.sidekick.shared.cards.g r2 = r2.f255779b     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r2 = r2.mo86172j()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            boolean r2 = r2.mo49318m()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            java.lang.String r6 = ""
            if (r2 != 0) goto L_0x00a2
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.apps.g.d.dj r2 = (com.google.android.apps.p489g.p494d.C9228dj) r2     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            int r7 = r2.f31901a     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            if (r7 != r3) goto L_0x00c3
            java.lang.Object r2 = r2.f31902b     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            goto L_0x00c3
        L_0x00a2:
            com.google.android.apps.gsa.sidekick.shared.cards.f r2 = r9.f255776a     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.apps.gsa.sidekick.shared.cards.g r2 = r2.f255779b     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.apps.gsa.sidekick.shared.e.a.k r2 = r2.mo86167f()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.protobuf.bv r7 = r0.instance     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.apps.g.d.dj r7 = (com.google.android.apps.p489g.p494d.C9228dj) r7     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            int r8 = r7.f31901a     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            if (r8 != r3) goto L_0x00b6
            java.lang.Object r6 = r7.f31902b     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
        L_0x00b6:
            com.google.common.util.concurrent.cx r2 = r2.mo86216c(r6)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            java.lang.Object r2 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148473g(r2, r4, r6)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
        L_0x00c3:
            r0.copyOnWrite()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            com.google.android.apps.g.d.dj r2 = (com.google.android.apps.p489g.p494d.C9228dj) r2     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            r6.getClass()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            r2.f31901a = r3     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            r2.f31902b = r6     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
        L_0x00d1:
            r1.mo17455a(r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00d5 }
            goto L_0x006a
        L_0x00d5:
            com.google.protobuf.bv r10 = r1.build()
            com.google.android.apps.g.d.dl r10 = (com.google.android.apps.p489g.p494d.C9230dl) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.cards.C91690e.doInBackground(com.google.android.apps.g.d.dl[]):com.google.android.apps.g.d.dl");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        C9230dl dlVar = (C9230dl) obj;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        if ((dlVar.f31905a & 4) != 0) {
            intent.putExtra("android.intent.extra.SUBJECT", dlVar.f31908d);
            StringBuilder sb = new StringBuilder();
            for (C9228dj djVar : dlVar.f31909e) {
                int i = djVar.f31901a;
                if (i == 1) {
                    sb.append((String) djVar.f31902b);
                } else if (i == 2) {
                    sb.append((String) djVar.f31902b);
                }
            }
            intent.putExtra("android.intent.extra.TEXT", sb.toString());
        } else {
            intent.putExtra("android.intent.extra.TEXT", String.format("%s\n\n%s", new Object[]{dlVar.f31906b, dlVar.f31907c}));
        }
        intent.setType("text/plain");
        intent.addFlags(268435456);
        Intent createChooser = Intent.createChooser(intent, this.f255776a.f255778a.getString(R.string.now_on_tap_share_with));
        createChooser.addFlags(268435456);
        this.f255776a.f255779b.mo86171i().mo86240d(this.f255776a.f255778a, createChooser);
    }
}
