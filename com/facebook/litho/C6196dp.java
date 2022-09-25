package com.facebook.litho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.litho.dp */
/* compiled from: PG */
public final class C6196dp extends RuntimeException {

    /* renamed from: a */
    C6154cb f18335a;

    /* renamed from: b */
    public final ArrayList f18336b = new ArrayList();

    /* renamed from: c */
    public final HashMap f18337c = new HashMap();

    /* renamed from: d */
    private final C6411u f18338d;

    /* renamed from: e */
    private final ComponentTree f18339e;

    public C6196dp(C6411u uVar, ComponentTree componentTree, Throwable th) {
        initCause(th);
        setStackTrace(new StackTraceElement[0]);
        this.f18338d = uVar;
        this.f18339e = componentTree;
    }

    public final String getMessage() {
        Throwable cause = getCause();
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }
        StringBuilder sb = new StringBuilder("Real Cause => ");
        sb.append(cause.getClass().getCanonicalName());
        sb.append(": ");
        sb.append(cause.getMessage());
        sb.append("\nLitho Context:\n");
        if (!this.f18336b.isEmpty()) {
            sb.append("  layout_stack: ");
            int size = this.f18336b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                sb.append(((C6407q) this.f18336b.get(size)).mo13461q());
                if (size != 0) {
                    sb.append(" -> ");
                }
            }
            sb.append("\n");
        }
        C6411u uVar = this.f18338d;
        if (uVar == null || uVar.mo13470f() == null) {
            ComponentTree componentTree = this.f18339e;
            if (!(componentTree == null || componentTree.f17879J == null)) {
                sb.append("  log_tag: ");
                sb.append(this.f18339e.f17879J);
                sb.append("\n");
            }
        } else {
            sb.append("  log_tag: ");
            sb.append(this.f18338d.mo13470f());
            sb.append("\n");
        }
        ComponentTree componentTree2 = this.f18339e;
        if (componentTree2 == null) {
            C6411u uVar2 = this.f18338d;
            componentTree2 = uVar2 != null ? uVar2.f19017j : null;
        }
        if (componentTree2 != null) {
            sb.append("  tree_root: ");
            sb.append(componentTree2.mo12706a().mo13461q());
            sb.append("\n");
        }
        C6411u uVar3 = this.f18338d;
        if (!(uVar3 == null || uVar3.f19012e == null)) {
            sb.append("  component_scope: ");
            sb.append(this.f18338d.f19012e.mo13461q());
            sb.append("\n");
        }
        sb.append("  thread_name: ");
        sb.append(Thread.currentThread().getName());
        sb.append("\n");
        C6411u uVar4 = this.f18338d;
        if (uVar4 == null || ((C6121bb) uVar4.mo13469d(C6121bb.class)) == null) {
            for (Map.Entry entry : this.f18337c.entrySet()) {
                sb.append("  ");
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append((String) entry.getValue());
                sb.append("\n");
            }
            return sb.toString().trim();
        }
        throw null;
    }
}
